package exceptions.learn;


class Temp1 {
	
	public void ExceptionOccuringMethod() throws ArithmeticException {
		throw new ArithmeticException("Arihmetic exception occured");
	}

	public void AnotherMethod() {
		try {
			ExceptionOccuringMethod();
		} catch(ArithmeticException e) {
			System.out.println("Handled locally "+ e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Temp1 ob = new Temp1();
			ob.AnotherMethod();
			System.out.println("This line will never execute");
		} catch(ArithmeticException e) {
			System.out.println("Exception occurred in ExceptionOccuringMEthod");
		}
	}
}
