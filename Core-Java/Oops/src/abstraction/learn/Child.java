package abstraction.learn;

abstract class Grandfather {
	abstract void add(int a, int b);

	void subtract() {
		System.out.println("This is subtract");
	}
}

abstract class Father extends Grandfather {}

public class Child extends Father {
	
	protected void add(int a, int b) {       // Cannot be private
		System.out.println("This is add function " + a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child ob = new Child();
		ob.add(2,3);
		ob.subtract();

		
		//Father ob1 = new Father(); Error you can not make object of abstract class.

	}

}