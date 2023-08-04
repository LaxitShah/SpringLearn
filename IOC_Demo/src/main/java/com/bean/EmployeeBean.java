package com.bean;

public class EmployeeBean {
	private int eId;
	private String eNameString;
	private String eAge;
	private String  rName;
	private int rId;
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteNameString() {
		return eNameString;
	}
	public void seteNameString(String eNameString) {
		this.eNameString = eNameString;
	}
	public String geteAge() {
		return eAge;
	}
	public void seteAge(String eAge) {
		this.eAge = eAge;
	}
	
	
}
