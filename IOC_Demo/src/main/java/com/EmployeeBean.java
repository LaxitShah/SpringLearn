package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//convert this class  to spring bean class

//4 annotations are there:@component,@service,@repository,@controller

@Component("employee")
public class EmployeeBean {
	
		@Value("101")
		private int eId;
		@Autowired
		private EmployeeDetail employeeDetail;
		
		
		public void display() {
			System.out.println("id: "+eId+"----"+employeeDetail.getEmpCity());
		}
		
		@PostConstruct
		public void initmethod() {
			System.out.println("init method called");
		}
		@PreDestroy
		public void destroymethod() {
			System.out.println("destroy method called");
		}
		
}
