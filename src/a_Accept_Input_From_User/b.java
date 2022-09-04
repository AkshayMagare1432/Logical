package a_Accept_Input_From_User;

import java.util.Scanner;

public class b 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
												System.out.println("Addition : ");
		
											    System.out.print("Enter Number 1: ");
		int num1 = scan.nextInt();
		
											    System.out.print("Enter Number 2: ");
		int num2 = scan.nextInt();
		
											    System.out.print("Answer : ");
		System.out.println(num1 + num2);
		
		
		System.out.println("--------------------------");
		
		System.out.print("Enter Student Name : ");
		
		String sname = scan.next();
		
		System.out.println(sname.toUpperCase());
	
	}

}
