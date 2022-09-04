package l_example12_Imp_Reverse_Number_without_String_Function;

public class d 
{
	public static void main(String[] args) 
	{
//		int num=1234;
//		int rev=0;
//		
//		for(int i=num; i>0; i=i/10)
//		{
//			int rem= i%10;
//			rev= rev *10 +rem;
//		}
//		System.out.println(rev);
		
		int[] a = new int[]{5,4,1,2,3};
		int temp = 0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
System.out.println(a[i]);

		
		}}}


