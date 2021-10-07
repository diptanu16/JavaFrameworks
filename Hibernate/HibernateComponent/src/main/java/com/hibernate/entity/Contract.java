package com.hibernate.entity;
//Table per Hierarchy Approach
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee")
@DiscriminatorValue("C")
public class Contract extends Employee{
	
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
