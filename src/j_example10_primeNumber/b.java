package j_example10_primeNumber;

public class b 
{
	public static void main(String[] args) 
	{
		int num=97;
		
		int count=0;
		
		for(int i=2; i<num; i++)
		{
			if(num % i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println(num + " is Not Prime Number");
		}
		
		else
		{
			System.out.println(num + " is Prime Number");
		}
			
		
	}

}
