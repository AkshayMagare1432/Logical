package g_fact_of_num;

public class a_eaxmple7_fact_of_num 
{
	public static void main(String[] args) 
	{
	

	int num = 4;    //4*3*2*1	 
	int fact = 1;     // 24

	//          4   0>=1
	for(int i =num; i>=1; i--)
	{
		fact = fact*i;     //   1*4=4*3=12*2=24*1=24      
	}
	

	System.out.println(fact);
}
}
