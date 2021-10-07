package inheritance.exercise1;

class Bird extends Animal {
//	private int a;
//	
//	void seta(int a) {
//		this.a = a;
//	}
//	
//	int geta() {
//		return this.a;
//	}
//	
	void fly() {
		System.out.println("Bird can fly");
	}
	
	@Override
	void eat() {
		System.out.println("Bird is eating");
	}
	
	@Override
	void sleep() {
		System.out.println("Bird is sleeping");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Animal();
		obj.eat();
		obj.sleep();
		
		Bird obj1 = new Bird();
		obj1.eat();
		obj1.sleep();
		obj1.fly();
	}

}
