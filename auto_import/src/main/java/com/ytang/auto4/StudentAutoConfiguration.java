package com.ytang.auto4;

import com.ytang.Student;
import org.springframework.context.annotation.Bean;

public class StudentAutoConfiguration {
    @Bean
    public Student student(){
        System.out.println("装载中.....");
        return new Student();
    }
}
