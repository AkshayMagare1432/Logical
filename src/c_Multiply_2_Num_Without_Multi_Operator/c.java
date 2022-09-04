package c_Multiply_2_Num_Without_Multi_Operator;

public class c 
{
	public static void main(String[] args) 
	{
		int num1=5;
		int num2=3;
		int num3=2;
		
		int sum=0;
		
		for(int i=1; i<=num2; i++)
		{
			sum=sum+num1;
		}
		
		int sum1=0;
		
		for(int i=1; i<=num3; i++)
		{
			sum1=sum1+sum;
		}
		
		System.out.println(sum1);
		
	}

}
