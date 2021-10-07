package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class Passport {
	
	
public Passport() {
}

@Id
@Column(name = "id")
private int employeeId;

@Column(name = "passportNo")
private String passportNo;

@Column(name = "country")
private String country;

@OneToOne
@MapsId
@JoinColumn(name="id")
private Employee employee;


	
	@Override
public String toString() {
	return "Passport [employeeId=" + employeeId + ", passportNo=" + passportNo + ", country=" + country + ", employee="
			+ employee + "]";
}


	public Passport( String passportNo, String country) {
	this.passportNo = passportNo;
	this.country = country;
}


	public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getPassportNo() {
	return passportNo;
}

public void setPassportNo(String passportNo) {
	this.passportNo = passportNo;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}


	
	
}	
