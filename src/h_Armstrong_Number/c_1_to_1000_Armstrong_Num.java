package h_Armstrong_Number;

public class c_1_to_1000_Armstrong_Num 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=2000; i++)
		{
			int sum=0;
			int sum1=0;
			
			for(int j=i; j>0; j=j/10)
			{
				int rem=j%10;
				
				sum=sum+ (rem*rem*rem);
				sum1=sum1+ (rem*rem*rem*rem);
			}
			
			if(i==sum)
			{
				System.out.println(i + " is Armstrong number---------");
			}
			
			else if(i==sum1)
			{
				System.out.println(i + " is Armstrong number---------");
			}
			
//			else
//			{
//				System.out.println(i + " is Not Armstrong number");
//			}
		}
		
	}

}
