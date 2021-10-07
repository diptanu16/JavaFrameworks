package encapsulation.exercise1;

class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	Book(String name, double price, int qtyInStock, String aname, String email, char gender){
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
		this.author = new Author(aname, email, gender);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAuthorName(String name) {
		this.author.setName(name);
	}

	public void setAuthorEmail(String email) {
		this.author.setEmail(email);
	}
	
	public void setAuthorGender(char gender) {
		this.author.setGender(gender);
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQtyInStock(int qty) {
		this.qtyInStock = qty;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAuthorName() {
		return this.author.getName();
	}
	
	public String getAuthorEmail() {
		return this.author.getEmail();
	}
	
	public char getAuthorGender() {
		return this.author.getGender();
	}
	public double getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return this.qtyInStock;
	}
	

}
