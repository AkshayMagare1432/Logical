package i_find_total_no_of_white_spaces_in_String;

public class b 
{
	public static void main(String[] args)
	{
		String s1= "a bc  d ";
		int count=0;
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char s = s1.charAt(i);
			
			if(s==' ')
			{
				count++;
			}
		}
		
		System.out.println("Num of spaces in String : "+ count);
		
	}

}
