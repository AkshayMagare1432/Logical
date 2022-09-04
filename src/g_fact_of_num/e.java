package g_fact_of_num;

public class e 
{
	public static void main(String[] args) 
	{

	int num = 20;
	int fact = 1;
	
	for(int i=num; i>=1; i--)
	{
		fact = fact * i;
	}
	
	System.out.println(fact);
	
	}

}
