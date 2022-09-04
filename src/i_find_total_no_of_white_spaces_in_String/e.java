package i_find_total_no_of_white_spaces_in_String;

public class e {

	public static void main(String[] args) 
	{
		String s1="a bcd";
		
		int count=0;
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char s2 = s1.charAt(i);
			
			if(s2==' ')
			{
				count++;
			}
		}
		System.out.println("Total spaces : "+ count);

	}

}
