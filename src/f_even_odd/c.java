package f_even_odd;

import java.util.Scanner;

public class c 
{
	public static void main(String[] args) 
	{
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("enter no: ");
		
		int num = scan.nextInt();
		
		System.out.println(num*num);
		
		if(num % 2==0)
		{
			System.out.println("Given number is Even");
		}
		
		else
		{
			System.out.println("Given number is Odd");
		}
		
	}

}
