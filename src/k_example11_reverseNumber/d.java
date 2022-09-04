package k_example11_reverseNumber;

public class d 
{
	public static void main(String[] args)
	{
		int num = 12321;
		
		String s1 = Integer.toString(num);
		
		String s2= "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		
		int rev = Integer.parseInt(s2);
		
		System.out.println("Num : "+ num);
		System.out.println("revNum : "+rev);
		
		if(num == rev)
		{
			System.out.println("Num is pallindrome");
		}
		else
		{
			System.out.println("Num is not pallindrome");
		}
	}

}
