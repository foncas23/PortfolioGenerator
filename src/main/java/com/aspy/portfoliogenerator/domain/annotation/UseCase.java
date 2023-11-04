package com.aspy.portfoliogenerator.domain.annotation;

import java.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Transactional
@Component
public @interface UseCase {}
