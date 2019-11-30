package com.ytang.auto2;

import com.ytang.auto1.StudentConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * enable模块装载-实现接口
 */
public class StudentImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{StudentConfiguration.class.getName()};
    }
}
