package com.gzy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
public @interface Test {
	public String name() default "guozy";
}
