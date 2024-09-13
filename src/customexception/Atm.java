package customexception;

import java.util.Scanner;

public class Atm {
	
	public static void main(String[] args) {
		int balance=10000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn");
		int amount=sc.nextInt();
		if(amount<=balance) {
			System.out.println("Amount Withdrawm");
			
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		
	}

}
