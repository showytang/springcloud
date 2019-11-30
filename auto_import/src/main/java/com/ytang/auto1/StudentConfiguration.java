package com.ytang.auto1;

import com.ytang.Student;
import org.springframework.context.annotation.Bean;

/**
 * enable模块构建-注解驱动方式
 */
public class StudentConfiguration {

    @Bean
    public Student student(){
        return new Student();
    }
    //在此类中定义多个对象构建.....
}
