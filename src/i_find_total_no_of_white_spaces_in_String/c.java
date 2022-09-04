package i_find_total_no_of_white_spaces_in_String;

import java.util.Scanner;

public class c 
{
	public static void main(String[] args)
	{
		String s1= "v elo city ";
		int count=0;
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char str = s1.charAt(i);
			
			if(str==' ')
			{
				count++;
			}
			
		}
		System.out.println("spaces : " + count);
	
	}

}
