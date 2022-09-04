package f_even_odd;

import java.util.Scanner;

public class i 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter No : ");
		int num = scan.nextInt(); 		
		
		if(num %2 == 0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}

}
