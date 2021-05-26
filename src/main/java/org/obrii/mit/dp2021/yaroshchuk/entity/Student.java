package org.obrii.mit.dp2021.yaroshchuk.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int id;
    private String name;
    private int age;

    @ManyToOne
    @JoinColumn(name="group_id")
    MitGroup mitGroup;

    @ManyToMany
    @JoinTable(name="visited_lesson",
            joinColumns=@JoinColumn(name="student_id"),
            inverseJoinColumns=@JoinColumn(name="lesson_id"))
    private Set<Lesson> visitedLesson;

    @OneToMany(mappedBy = "student")
    private Set<MarkLesson> marks;

    public Set<MarkLesson> getMarks() {
        return marks;
    }

    public void setMarks(Set<MarkLesson> marks) {
        this.marks = marks;
    }
    
    public Set<Lesson> getVisitedLesson() {
        return visitedLesson;
    }

    public void setVisitedLesson(Set<Lesson> visitedLesson) {
        this.visitedLesson = visitedLesson;
    }
    
    
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public MitGroup getMitGroup() {
        return mitGroup;
    }

    public void setMitGroup(MitGroup mitGroup) {
        this.mitGroup = mitGroup;
    }
    
}
