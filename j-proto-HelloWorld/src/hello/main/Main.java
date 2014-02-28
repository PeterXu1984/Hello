package hello.main;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("fresh!!");
		System.out.println("another line");
		System.out.println("press any key to continue...");
		
		A a = new A();
		a.print();
		
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
