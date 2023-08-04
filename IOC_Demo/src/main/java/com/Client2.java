package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ConfigurationClass;

public class Client2 {
	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		EmployeeBean emp=ctx.getBean("employee",EmployeeBean.class);
		 System.out.println(emp.hashCode());
		
	}
}
