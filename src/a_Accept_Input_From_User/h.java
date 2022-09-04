package a_Accept_Input_From_User;

import java.util.Scanner;

public class h 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter num1: ");
		int num1 = scan.nextInt();
		
		System.out.print("enter num2: ");
		int num2 = scan.nextInt();
		
		System.out.println("Ans.");
		System.out.println(num1*num2);
		
		System.out.println("-------------------");
		
		System.out.println("Convert Name To UpperCase");
		
		String name = scan.next();
		System.out.println(name.toUpperCase());
		
	}

}
