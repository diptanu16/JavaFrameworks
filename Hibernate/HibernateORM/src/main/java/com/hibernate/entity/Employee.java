package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="info")
public class Employee {
	
	public Employee() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", Namee=" + Namee + ", Designation=" + Designation + ", Salary=" + Salary
				+ "]";
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getNamee() {
		return Namee;
	}

	public void setNamee(String namee) {
		Namee = namee;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmpId")
	private int  EmpId;
	
	@Column(name="Namee")
	private String Namee;
	
	@Column(name="Designation")
	private String Designation;
	
	@Column(name="Salary")
	private int Salary;

	public Employee(String namee, String designation, int salary) {
		super();
		EmpId = getEmpId();
		Namee = namee;
		Designation = designation;
		Salary = salary;
	}


}
