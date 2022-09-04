package i_find_total_no_of_white_spaces_in_String;

public class f 
{
	public static void main(String[] args) 
	{
		String s1= "kjvreughfjdefuefdjsgfwgd";
		int count = 0;
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char s2 = s1.charAt(i);
			
			if(s2 == 'f')
			{
				count++;
			}
		}
		System.out.println("No. of f : "+count);
		
	}

}
