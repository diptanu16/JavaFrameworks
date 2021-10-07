package finalkeyword.learn;

final class AmiGyani {}    // Can not be inherited

class EtoGyaniNa {
	
	final int a = 5;      // Once variable is final it can not be modified
	final int b;
	
	EtoGyaniNa(int b) {
		//this.a = a;      // This will give error
		this.b = b;        // Final variables which are not initialized can be modified only once
		//this.b++;        // It can't be modified
	}
	
	EtoGyaniNa() { this.b = 34; }       // All constructors should initialize the uninitialized final variables.
	
	final void finalMethod() {                      // this can not be overridden
		System.out.println("This is final method");
	}
	
}

 class Finalchild extends EtoGyaniNa {

//	@Override
//	void finalMethod() {
//		System.out.println("Overridden");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmiGyani ob = new AmiGyani();
		EtoGyaniNa ob1 = new EtoGyaniNa(10);
	}
	
}
