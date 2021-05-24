package org.obrii.dp2021.yaroshchuk.controller;

import java.util.List;
import org.obrii.dp2021.yaroshchuk.entity.Embedded;
import org.obrii.dp2021.yaroshchuk.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MessageController {

    private final String URL = "http://localhost:8098/Lab7serv/student";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getMessage")
    public String getFormData(Model model) {

        Embedded messageEntity = restTemplate.getForObject(URL, Embedded.class);

        List<Student> list = messageEntity.getListOfStudents().getStudentList();

        model.addAttribute("students", list);

        return "result";
    }
    
    
    @PostMapping("/add")
    public String createData(@RequestParam(name = "name") String name,
            @RequestParam(name = "age") String age,
            Model model) {

        restTemplate.postForObject(URL, new Student(name,Integer.parseInt(age)),Student.class);

        return getFormData(model);
    }

    @PostMapping("/update")
    public String updateData(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "age") String age,
            @RequestParam(name = "url") String url,
            Model model) {

        restTemplate.put(url, new Student(name,Integer.parseInt(age)));

        return getFormData(model);
    }
    
     @PostMapping("/delete")
    public String deleteData(@RequestParam(name = "url") String url,
            Model model) {

        restTemplate.delete(url);

        return getFormData(model);
    }

}
