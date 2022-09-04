package f_even_odd;

public class f 
{
	public static void main(String[] args) 
	{
		int ar [] = {2,5,6,3,4,2};
		
		System.out.println(ar[1]);
		System.out.println(ar.length);
		
		for(int i=0; i<=ar.length-1; i++)
		{
			if(ar[i] % 2==0)
			{
				System.out.println(ar[i] +" even");
			}
			
			else
			{
				System.out.println(ar[i] + " odd");
			}
		}
		
	}

}
