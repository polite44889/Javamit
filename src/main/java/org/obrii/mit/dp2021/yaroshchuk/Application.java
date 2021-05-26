package org.obrii.mit.dp2021.yaroshchuk;

import java.util.HashSet;
import java.util.Set;
import org.obrii.mit.dp2021.yaroshchuk.entity.Lesson;
import org.obrii.mit.dp2021.yaroshchuk.entity.MarkLesson;
import org.obrii.mit.dp2021.yaroshchuk.entity.MitGroup;
import org.obrii.mit.dp2021.yaroshchuk.entity.Student;
import org.obrii.mit.dp2021.yaroshchuk.repository.LessonRepository;
import org.obrii.mit.dp2021.yaroshchuk.repository.MarkRepository;
import org.obrii.mit.dp2021.yaroshchuk.repository.MitGroupRepository;
import org.obrii.mit.dp2021.yaroshchuk.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
    @Autowired
    StudentRepository studentRepository;
    
    @Autowired
    MitGroupRepository mitGroupRepository;

    @Autowired
    LessonRepository lessonRepository;

    @Autowired
    MarkRepository markRepository;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        MitGroup g1 = new MitGroup("MIT-21");
        MitGroup g2 = new MitGroup("MIT-31");
        mitGroupRepository.save(g1);
        mitGroupRepository.save(g2);
        
        Lesson lesson1 = new Lesson("lecture1");
        Lesson lesson2 = new Lesson("lecture2");
        Lesson lesson3 = new Lesson("lecture3");
        
        lessonRepository.save(lesson1);
        lessonRepository.save(lesson2);
        lessonRepository.save(lesson3);
        
        Set<Lesson> s1 = new HashSet<>();
       
        s1.add(lesson1);
        s1.add(lesson2);
        
        Student Kirill = new Student("Kiril",34);
        Kirill.setVisitedLesson(s1);
        Student Kolya = new Student("Kolya",99);
        Kolya.setVisitedLesson(s1);
        
        Set<Lesson> s2 = new HashSet<>();
        s2.add(lesson3);
        
        Student Sasha = new Student("Sasha",25);
        Sasha.setVisitedLesson(s2);
        
        Kirill.setMitGroup(g2);
        Kolya.setMitGroup(g1);
        Sasha.setMitGroup(g1);
        
        studentRepository.save(Kirill);
        studentRepository.save(Kolya);
        studentRepository.save(Sasha);
        
        MarkLesson mark1 = new MarkLesson(Kirill, lesson1, 90);
        MarkLesson mark2 = new MarkLesson(Kirill, lesson1, 89);
        MarkLesson mark3 = new MarkLesson(Kolya, lesson2, 90);
        MarkLesson mark4 = new MarkLesson(Kolya, lesson1, 80);
       
        markRepository.save(mark1);
        markRepository.save(mark2);
        markRepository.save(mark3);
        markRepository.save(mark4);
        }


}
