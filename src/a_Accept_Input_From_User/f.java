package a_Accept_Input_From_User;

import java.util.Scanner;

public class f 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("except num1: ");
		int num1 = scan.nextInt();
		
		System.out.print("except num2: ");
		int num2 = scan.nextInt();
		
		System.out.println("Ans.");
		System.out.println(num1+num1);
		
		System.out.println("------------------------");

		String name = scan.next();
		
		System.out.println(name.toUpperCase());
		
	}

}
