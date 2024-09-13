package customexception;

import java.util.Scanner;

public class SolutionWrong {

	static void password(int otp) throws WrongPasswordException
	{
		if(otp==1234) {
			System.out.println("Login Successfull");

		}
		else {
			throw new WrongPasswordException("Please check the password you Entered");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		int a=sc.nextInt();


		try {
			password(a);
		}
		catch(WrongPasswordException w){
			System.out.println(w.getMessage());
		}
	}
}
