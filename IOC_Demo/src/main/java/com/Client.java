package com;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Client {
	public static void main(String[] args) {
			
		//lazy loading or lazy binding
		FileSystemResource res=new FileSystemResource("src/main/resources/spring.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);

		StudentBean s1=factory.getBean("student",StudentBean.class); 
		StudentBean s2=factory.getBean("student",StudentBean.class); 
		
		//early loading
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/resources/spring.xml");
		StudentBean s3= (StudentBean) ctx.getBean("student");
		StudentBean s4= (StudentBean) ctx.getBean("student");
		
		
		//by default singleton pattern
		
		//bean objects
		System.out.println(s1.hashCode());
		System.out.println(s2 .hashCode());
		
		//context object
		System.out.println(s3.hashCode());
		System.out.println(s4 .hashCode());
		s3.display();
		
	}
}
