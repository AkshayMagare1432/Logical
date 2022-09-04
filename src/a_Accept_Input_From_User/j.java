package a_Accept_Input_From_User;

import java.util.Scanner;

public class j {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter num1 : "); 
		int num1 = scan.nextInt();
		
		System.out.println("enter num2 : "); 
		int num2 = scan.nextInt();
		
		System.out.println("Ans :" + num1 * num2);

	}

}
