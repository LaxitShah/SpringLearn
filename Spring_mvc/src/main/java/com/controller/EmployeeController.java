package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.EmployeeBean;

//@Controller
//@RequestMapping("employee")
public class EmployeeController {
	
//	@RequestMapping("/dashbord")
//	public String dashBoard() {
//		return "redirect:newdashbord";
//	}
//	@RequestMapping("/newdashbord")
//	public String newDashBoard() {
//		
//		System.out.println("new dashboard");
//		
//		return "home";
//	}
	
	@RequestMapping("/addemployee")
	public String addEmployee(Model model) {
		
		EmployeeBean employeeBean=new EmployeeBean();
		model.addAttribute(employeeBean);
		
		return "addEmployee";
	}
//	//@RequestMapping("/insertemployee")
//	
////	@RequestMapping(value = "/insertemployee", method=RequestMethod.POST)
//	@PostMapping(value = "insertEmployee")
////	@GetMapping
//	public String insertEmployee(@RequestParam("txtEmployeeName") String eName,@RequestParam("txtEmployeeAge") String eAge) {
//		
//		System.out.println("insert employee");
//		System.out.println("employee name= "+eName);
//		System.out.println("employee age= "+eAge);
//		
//		
//		return "home";
//			
//	}
	@RequestMapping(value="/insertemployee")
	public String insertEmployee(EmployeeBean employeeBean)  {
		
		
		System.out.println(employeeBean.getEmployeeName() );
		System.out.println(employeeBean.geteAge());
		return "home";
	}
	
	
}
