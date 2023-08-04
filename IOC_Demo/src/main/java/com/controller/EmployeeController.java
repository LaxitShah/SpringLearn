package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.EmployeeBean;
import com.config.DbConfig;
import com.dao.EmployeeDao;

public class EmployeeController {
	
	@Autowired
	static EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(DbConfig.class);
		employeeDao=(EmployeeDao) ctx.getBean("empDao");
		int res=employeeDao.addEmployee();
			
		if(res>0) {
			System.out.println("record inserted");
		}
		System.out.println(employeeDao.deleteEmployee(1)+" employee deleted");
		
		//System.out.println("updated query "+employeeDao.updateEmployee());
		
		List<EmployeeBean> emplist=employeeDao.employeeList();
		for(EmployeeBean emp:emplist) {
			System.out.println(emp.geteId()+" "+emp.geteNameString()+" "+emp.geteAge()+" "+emp.getrName());
			
		}
		//EmployeeBean employeeBean=employeeDao.getEmployeeBean("abcd");
		//System.out.println(employeeBean.geteAge());
	}
	public void addEmp() {
		
	}
}
