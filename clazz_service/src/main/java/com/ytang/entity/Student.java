package com.ytang.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;
}
