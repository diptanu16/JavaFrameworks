package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee")
@DiscriminatorValue("R")
public class Regular extends Employee {
	
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
