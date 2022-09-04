package h_Armstrong_Number;

public class f 
{
	public static void main(String[] args) 
	{
		int num =153;
		int sum = 0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem=i%10;
			
			sum=sum+(rem*rem*rem);
			
		}
		if(sum==num)
		{
			System.out.println("Armstrong :"+ num); 
		}
		else
		{
			System.out.println("Not Armstrong :"+ num);
		}
		
	}
	

}
