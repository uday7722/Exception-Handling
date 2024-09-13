package com;

public class Demo {
	public static void main(String[] args) {
		try {
		System.out.println(10/0);
	}
		catch(Exception e) {
			System.out.println("can't be divided by Zero");
		}

}
}