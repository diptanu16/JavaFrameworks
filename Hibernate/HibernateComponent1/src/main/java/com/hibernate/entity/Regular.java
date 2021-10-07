package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="regular")
@PrimaryKeyJoinColumn(name="employee_id")
public class Regular extends Employee{
	
public Regular() {}
	
	@Column(name="qplc")
	private String qplc;

	

	public Regular(String qplc) {
		super();
		this.qplc = qplc;
	}

	public String getQplc() {
		return qplc;
	}

	public void setQplc(String qplc) {
		this.qplc = qplc;
	}
	@Override
	public String toString() {
		return "Regular [qplc=" + qplc + "]";
	}

}

	


