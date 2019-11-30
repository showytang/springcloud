package com.ytang.service.impl;

import com.ytang.dao.StudentDao;
import com.ytang.entity.Student;
import com.ytang.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentDao dao;

    @Value("${server.port}")
    private String port;

    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @Override
    public List<Student> find() {
        return dao.findAll();
    }

    @Override
    public Student findById(Integer id) {
        Student student = dao.findById(id).get();
        student.setName(ip+":"+port);
        return student;
    }

    @Override
    public void save(Student stu) {
        dao.save(stu);
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public void update(Student stu) {
        dao.save(stu);
    }
}
