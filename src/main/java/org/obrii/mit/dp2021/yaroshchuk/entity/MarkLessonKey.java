package org.obrii.mit.dp2021.yaroshchuk.entity;

import java.io.Serializable;
import javax.persistence.Column;

public class MarkLessonKey implements Serializable{
    @Column(name = "student_id")
    Integer studentId;
    
    @Column(name = "lesson_id")
    Integer lessonId;

    public MarkLessonKey() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    

    
    
}
