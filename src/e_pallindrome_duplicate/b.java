package e_pallindrome_duplicate;

public class b 
{
	public static void main(String[] args)
	{
		String s1="madam";
		String s2="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equals(s2))
		{
			System.out.println("Given String is Pallindrome"); 
		}
		
		else
		{
			System.out.println("Given String is NOT Pallindrome");
		}
		
	} 

}
