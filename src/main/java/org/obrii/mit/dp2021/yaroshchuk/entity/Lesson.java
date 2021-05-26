package org.obrii.mit.dp2021.yaroshchuk.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int id;
    private String title;
    
    @ManyToMany(mappedBy="visitedLesson")
    Set<Student> visited;

    public Set<Student> getVisited() {
        return visited;
    }

    public void setVisited(Set<Student> visited) {
        this.visited = visited;
    }

    public Set<MarkLesson> getMarks() {
        return marks;
    }

    public void setMarks(Set<MarkLesson> marks) {
        this.marks = marks;
    }

    @OneToMany(mappedBy = "lesson")
    private Set<MarkLesson> marks;
    
    public Lesson() {
    }

    public Lesson(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
}
