package com.sun.customer;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(TurbineStreamConfiguration.class)
public @interface EnableTurbineStream {

}
