package com.salesforcePractice03;

public class Dapart extends Employee {
	
    private String dapart;
    
    public Dapart(String name, int salary, String dapart) {
		super(name, salary);
		this.dapart = dapart;
	}
    
    public void getInformation() {
    	System.out.println("이름: " + super.getName() + " 연봉: " + super.getSalary() + " 부서 : " + dapart);
    }
}
