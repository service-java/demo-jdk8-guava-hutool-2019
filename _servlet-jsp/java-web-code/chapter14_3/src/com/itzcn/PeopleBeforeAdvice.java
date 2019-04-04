package com.itzcn;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class PeopleBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.print(arg2.getClass().getSimpleName() + " is " + arg0.getName() +"!\t");

	}

}
