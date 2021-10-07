package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


	
@Entity
@Table(name="employee")
public class Employee {
	
	public Employee() {	
	}

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="employee_id")
		private Long employeeId;
		
		@Column(name="firstname")
		private String firstname;
		
		@Column(name="lastname")
		private String lastname;
		
		@ManyToOne
		@JoinColumn(name="department_id")
		private Department department;
		
		
		
		public Employee(String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
	
		}



		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", department=" + department + "]";
		}



		public Long getEmployeeId() {
			return employeeId;
		}



		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}



		public String getFirstname() {
			return firstname;
		}



		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}



		public String getLastname() {
			return lastname;
		}



		public void setLastname(String lastname) {
			this.lastname = lastname;
		}



		public Department getDepartment() {
			return department;
		}



		public void setDepartment(Department department) {
			this.department = department;
		}

}

