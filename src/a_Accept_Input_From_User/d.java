package a_Accept_Input_From_User;

import java.util.Scanner;

public class d 
{
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("First Additon :");
		
		System.out.print("Enter First Num1 :");
		int num1 = scan.nextInt();
		
		System.out.print("Enter Second Num2 :");
		int num2 = scan.nextInt();
		
		System.out.print("Last Add Num3 :");
		int num3 = scan.nextInt();
		
		
		System.out.print("Answer :");
		System.out.println(num1+num2+num3);
		
		System.out.println("-----------------------");
		
		System.out.print("Write a Name & Automatically convert in Capital letter :");
		String name = scan.next();
		System.out.println(name.toUpperCase());
		
		
		System.out.println("-------------------------");
		System.out.print("Now write name in upper to convert in lower :");
		String name1 = scan.next();
		System.out.println(name1.toLowerCase());
		
		
	}

}
