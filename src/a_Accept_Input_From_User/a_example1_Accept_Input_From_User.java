package a_Accept_Input_From_User;

import java.util.Scanner;

public class a_example1_Accept_Input_From_User 
{
public static void main(String[] args) {
	
	
	Scanner scan=new Scanner(System.in);
	System.out.print("enter num1: ");
	int num1 = scan.nextInt();      //accept int input from user
	System.out.print("enter num2: ");
	int num2 = scan.nextInt();

	System.out.println(num1+num2);
		
	System.out.println("----------------------------");
	
	System.out.print("enter student name: ");
	String s1 = scan.next();
	System.out.println(s1.toUpperCase());
	
}
}
