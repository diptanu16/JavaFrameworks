package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contract")
@PrimaryKeyJoinColumn(name="employee_id")
public class Contract extends Employee {
public Contract() {}
	
	@Column(name="allowance")
	private String allowance;
	
	@Override
	public String toString() {
		return "Contract [allowance=" + allowance + "]";
	}

	public Contract(String allowance) {
		super();
		this.allowance = allowance;
	}

	public String getAllowance() {
		return allowance;
	}

	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}

	

}


