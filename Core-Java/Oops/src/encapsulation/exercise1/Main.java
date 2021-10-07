package encapsulation.exercise1;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book("Applied Maths", 120.98, 2, "RD Sharma", "abc@gmail.com", 'M');
		
		System.out.println("Book name: " + obj.getName());
		System.out.println("Author: " + obj.getAuthorName());
		System.out.println("Email: " + obj.getAuthorEmail());
		System.out.println("Gender: " + obj.getAuthorGender());
		System.out.println("Price: " + obj.getPrice());
		System.out.println("Quantity in stock: " + obj.getQuantity());
	}

}
