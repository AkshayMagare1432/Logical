package m_example13_Reverse_middle_String;

public class example13_Reverse_middle_String 
{
	public static void main(String[] args) 
	{
		

		String str = "my name is abc"; 

		String[] ar = str.split(" "); //[my(0) name(1) is(2) abc(3)]
		                                //ym           //si
				//  0    4<=3		
		for (int i = 0; i <= ar.length - 1; i++) 
		{
			// 3%2=1==0
			if (i % 2 != 0)
			{				//2
				String s1 = ar[i];    //is
				ar[i] = reverseString(s1); //si  //re initialization of string info for even index			
			}

		}
		
		for (int i = 0; i <= ar.length-1; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

	//local fn
	public static String reverseString(String org)
	{
		String rev = "";
		for (int i = org.length() - 1; i >= 0; i--)
		{
			rev = rev + org.charAt(i);
		}
		return rev;
	}

}
