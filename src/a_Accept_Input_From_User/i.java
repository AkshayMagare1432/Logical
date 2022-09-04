package a_Accept_Input_From_User;

import java.util.Arrays;
import java.util.Scanner;

public class i 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		
		String name = scan.next();
		
		if(name.equals("Aniket"))
		{
			System.out.println(name+" Jadhav");
		}
		
		else if(name.equals("Akshay"))
		{
			System.out.println(name+" Magare");
		}
		
		else if(name.equals("Rajkumar"))
		{
			System.out.println(name+" Wagdole");
		}
		
	}
	 

}
