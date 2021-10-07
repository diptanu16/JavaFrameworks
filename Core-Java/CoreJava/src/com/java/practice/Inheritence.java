package com.java.practice;

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BoxerWeight box = new BoxerWeight(10,10,1,50);
	System.out.println("The volume is "+box.volume());
	System.out.println("The weight of the box is: "+ box.weight+"Kg");
	
	
	}

}
class Boxer{
	int height;
	int width;
	int length;
	
	public Boxer(int height, int width, int length) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}
	double volume() {
		return height*length*width;
	}
}
class BoxerWeight extends Boxer{
	int weight;

	public BoxerWeight(int height, int width, int length, int weight) {
		super(height, width, length);
		this.weight = weight;
	}
}


