package j_example10_primeNumber;

public class a_example10_primeNumber {
	public static void main(String[] args) {

		int num = 9;
		int count = 0;
				    	
				// 2    3<9		         // 2-8
		for (int i = 2; i < num; i++)
		{		
			//  9%3= 0 ==0	
			if (num % i == 0)        
			{
				count++;    //1
				break;
			}
		}

		if (count == 1)
		{
			System.out.println("given number is not a prime number");
		} 
		else
		{
			System.out.println("given number is a prime number");
		}

	}
	
	// find prime no from 1 to 100
}