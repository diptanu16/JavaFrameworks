package inheritance.exercise2;

class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Employee ob = new Employee(120000, 1212, "12d23s");
		ob.setName("Diptanu");
		ob.setAnnualSalary(1200);
		
		System.out.println(ob.getName());
		System.out.println(ob.getAnnualSalary());
	}
}
