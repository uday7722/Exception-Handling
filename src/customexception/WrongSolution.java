package customexception;

import java.util.Scanner;

public class WrongSolution {
	
	public static void checkPin(int pin) throws WrongPinException {
		if(pin==1234) {
			System.out.println("Enter the amount");
		}
		else {
			throw new WrongPinException("Try again");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin");
		int pin=sc.nextInt();
		try {
			checkPin(pin);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("Done bro");
		}
		
	}
	
	

}
