package j_example10_primeNumber;

public class c 
{
	public static void main(String[] args) 
	{
		int num=87;
		
		int count=0;
		
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println(num + " is not prime number");
		}
		else
		{
			System.out.println(num + " is prime number");
		}
		
	}

}
