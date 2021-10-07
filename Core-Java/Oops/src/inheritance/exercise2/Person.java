package inheritance.exercise2;

class Person {
	private String name;
	
	Person() {}

	Person(String name) {
		this.name = name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
}
