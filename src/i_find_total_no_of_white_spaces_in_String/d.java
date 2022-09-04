package i_find_total_no_of_white_spaces_in_String;

public class d 
{
	public static void main(String[] args) 
	{
		String s1="banana";
		
		int count=0;
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char s2 = s1.charAt(i);
			
			if(s2=='a')
			{
				count++;
			}
		}
		System.out.println("a count :"+count);
		
	}

}
