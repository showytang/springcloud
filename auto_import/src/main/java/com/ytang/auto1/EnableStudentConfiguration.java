package com.ytang.auto1;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(StudentConfiguration.class)
public @interface EnableStudentConfiguration {
}
