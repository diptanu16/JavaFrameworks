package packages.learn;

class TopLevelClass0 {

	protected class PrivateInnerClass {
		public void show() {
			System.out.println("Inner class");
		}
	}
}

class TopLevelClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopLevelClass0 ob = new TopLevelClass0();
		
		TopLevelClass0.PrivateInnerClass ob1 = ob.new PrivateInnerClass();

		ob1.show();

	}
}
