package exceptions.learn;

import java.io.*;
import java.util.Scanner;

class CustomException extends Exception {
	
	@Override
	public String toString() {
		return "Custom exception occurred";
	}
	
}

class Temp {
	int aa = 10;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		Scanner o = new Scanner(System.in);
		
		int a = 0;
		try {
			a = Integer.parseInt(br.readLine());
			System.out.println(a);
			
			throw new CustomException();
			
		} catch(NullPointerException e) {
			System.out.println("You have null pointer exception");
		} catch(NumberFormatException e) {
			System.out.println("Number format exception occurred " + e);
		} catch(CustomException e) {

			e.printStackTrace();
			System.out.println(e);
		} catch(Exception e) {
			System.out.println("Some unknown exception occured");
		} finally {
			System.out.println("This block will get executed even if error is there");
			br.close();
			in.close();
		}
		
		System.out.println("If this gets printed then program is successfully executed");

	}
}
