package a_Accept_Input_From_User;

import java.util.Scanner;

public class e 
{
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lets Do addition");
		
		System.out.print("Enter Num1 :");
		int a1 =scan.nextInt();
		
		System.out.print("Enter Num2 :");
		int a2 = scan.nextInt();
		
		System.out.print("Enter Num3 :");
		int a3 = scan.nextInt();
		
		System.out.print("Ans.");
		System.out.println(a1+a2+a3);
		
		
		System.out.println("Now do Multiplication");
		
		System.out.print("Enter Num1 :");
		int m1 = scan.nextInt();
		
		System.out.print("Enter Num2 :");
		int m2 = scan.nextInt();
		
		System.out.print("Ans.");
		System.out.println(m1*m2);
		
		System.out.println("----------------------------------");
		
		System.out.println();
		System.out.println("Now use String ");
		
		System.out.print("Add Student Name :");
		String name = scan.next();
		
		System.out.print("To convert UpperCase :");
		String n = name.toUpperCase();
		System.out.println(n);
		
		System.out.print("Add Surname :");
		String surname = scan.next();
		String s = surname.toUpperCase();
		System.out.println(s);
		
		System.out.println("------------------------");
		System.out.println();
		System.out.print("Lets combine : ");
		
		System.out.println(n+" "+s);
		
		
		
	}

}
