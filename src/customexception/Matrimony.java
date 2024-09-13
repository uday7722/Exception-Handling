package customexception;

import java.util.Scanner;

public class Matrimony {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the damn age");
		int age=sc.nextInt();
		if(age>=25) {
			System.out.println("All the best");
		}
		else {
			try {
				throw new NotValidException("Nah..Wait"); 
			}
			catch(NotValidException n) {
				System.out.println(n.getMessage());
			}
		}



	}



}
