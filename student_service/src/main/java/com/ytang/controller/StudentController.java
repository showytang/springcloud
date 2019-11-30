package com.ytang.controller;

import com.ytang.entity.Student;
import com.ytang.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    IStudentService service;

    @GetMapping
    public List<Student> find() {
        return service.find();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable("id") Integer id){
        return service.findById(id);
    }


}
