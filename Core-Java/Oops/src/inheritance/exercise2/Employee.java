package inheritance.exercise2;

class Employee extends Person {
	private double annualSalary;
	private int year;
	private String nationalInsuranceNumber;
	
	Employee(double annualSalary,int year,String nationalInsuranceNumber) {
		this.annualSalary = annualSalary;
		this.year = year;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	
	void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	double getAnnualSalary() {
		return this.annualSalary;
	} 
}
