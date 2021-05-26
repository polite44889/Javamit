package org.obrii.mit.dp2021.yaroshchuk.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MitGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int id;
    private String title;

    @OneToMany(mappedBy="mitGroup")
    Set<Student> members;

    public Set<Student> getMembers() {
        return members;
    }

    public void setMembers(Set<Student> members) {
        this.members = members;
    }
    
    public MitGroup() {
    }

    public MitGroup(String title) {
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
