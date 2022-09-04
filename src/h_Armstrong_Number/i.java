package h_Armstrong_Number;

public class i 
{
	public static void main(String[] args) 
	{
		int num = 153;
		int sum = 0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem = i % 10;
			
			sum = sum + (rem*rem*rem); 
		}
		if(num==sum)
		{
			System.out.println(num + " is Armstrong");
		}
		else
		{
			System.out.println(num + " is Not Armstrong");
		}
		
	}

}
