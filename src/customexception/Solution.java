package customexception;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password");
		int password=sc.nextInt();

		if(password==123) {
			System.out.println("login Successfull!");
		}
		else {
			try {
				throw new InvalidPasswordException("Enter the valid Password"); //throw 
			}
			catch(InvalidPasswordException e) {
				System.out.println(e.getMessage()); 
			}
		}
	}
}
