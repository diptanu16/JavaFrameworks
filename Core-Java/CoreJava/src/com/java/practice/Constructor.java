package com.java.practice;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(10,24,1);
		System.out.println("volume is : "+box.volume());
		
		

	}

}

class Box{
	int height;
	int length;
	int width;
   
	Box(int height,int length,int width){
		 this.height=height;
		 this.length=length;
		 this.width=width;
		
	}
	double volume() {
		return height*length*width;
		
	}
}
