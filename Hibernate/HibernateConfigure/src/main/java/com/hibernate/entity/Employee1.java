package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="info")
public class Employee1 {
	
	public Employee1() {
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmpId")
	private int  EmpId;
	
	@Column(name="EmpName")
	private String EmpName;
	
	@Column(name="EmpBand")
	private String EmpBand;
	
	public Employee1(int empId, String empName, String empBand) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpBand = empBand;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpBand() {
		return EmpBand;
	}

	public void setEmpBand(String empBand) {
		EmpBand = empBand;
	}

	@Override
	public String toString() {
		return "Employee1 [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpBand=" + EmpBand + "]";
	}

	

}
