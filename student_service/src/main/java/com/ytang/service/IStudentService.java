package com.ytang.service;

import com.ytang.entity.Student;

import java.util.List;

public interface IStudentService {

    List<Student> find();

    Student findById(Integer id);

    void save(Student stu);

    void delete(Integer id);

    void update(Student stu);

}
