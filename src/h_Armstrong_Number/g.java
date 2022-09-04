package h_Armstrong_Number;

public class g
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=1000; i++)
		{
			int sum=0;
			
			for(int j=i; j>0; j=j/10)
			{
				int rem=j%10;
				sum=sum+(rem*rem*rem);
			}
			if(i==sum)
			{
				System.out.println("Armstrong Number :"+ i);
			}
		}
		
		
	}

}
