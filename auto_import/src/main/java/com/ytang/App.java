package com.ytang;

import com.ytang.auto2.EnableImplementsStudentConfiguration;
import com.ytang.auto3.EnableStudentConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@EnableStudentConfiguration
//@EnableImplementsStudentConfiguration
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Student bean = context.getBean(Student.class);
        System.out.println(bean);
    }
}
