package org.obrii.dp2021.yaroshchuk.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Embedded {
    @JsonProperty("_embedded")
    private StudentList listOfStudents;    
    
      

    public Embedded() {
    }

    public StudentList getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(StudentList listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    
    
    
}
