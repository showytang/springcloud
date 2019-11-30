package com.ytang.auto2;

import com.ytang.auto1.StudentConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(StudentImportSelector.class)
public @interface EnableImplementsStudentConfiguration {
}
