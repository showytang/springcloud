package com.ytang.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;
}
