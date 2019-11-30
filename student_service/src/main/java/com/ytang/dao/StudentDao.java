package com.ytang.dao;

import com.ytang.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentDao extends JpaRepository<Student,Integer>, JpaSpecificationExecutor<Student> {

}
