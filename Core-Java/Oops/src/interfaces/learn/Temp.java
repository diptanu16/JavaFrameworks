package interfaces.learn;
interface Interface1 {
	int finalVar = 5;         // By default final and static
	// int finalVar2;         Error You have to initialize it while declaring
	static void method1() {
		System.out.println("By default interface methods are final and abstract");
		//finalVar = 23;         Error // Interface data members are by default final
	}
	void method2();
}
interface Interface2 {
	void method2();      // Interface methods are abstract and public by default
}
interface Interface3 extends Interface2, Interface1 {} // Interface can not be final
class ClassName {
	static int tempVar = 5;
	void tempMethod() {}
	
	protected void method1() {
		System.out.println("This can be overridden");
	}
}
class Temp extends ClassName implements Interface3, Interface1 {
//	@Override
//	static void method1() {
//		System.out.println("Interface methods can not be overridden because they are static");
//	}
	@Override
	public void method2() {                             // You have to override with public access specifier
		System.out.println("Overridden method");        // In overriding you can not decrease visibility
	}
	@Override
	public void method1() {
		System.out.println("Visibility can be increased but can not be decreased");
	}

	public static void main(String[] args) {		
		//Interface1 ob = new Interface1();               You can't make object of interface
		Interface1.method1();
		Interface3 ob = new Temp();
		ob.method2();
		//ob.method1();
		System.out.println(ClassName.tempVar);
		System.out.println(Interface1.finalVar);
		
	}

}
