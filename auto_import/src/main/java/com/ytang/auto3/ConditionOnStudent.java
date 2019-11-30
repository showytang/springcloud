package com.ytang.auto3;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Conditional(StudentCondition.class)
public @interface ConditionOnStudent {
    public String name();
    public String value();

}
