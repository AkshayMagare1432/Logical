package n_example14_Count_Reapeating_Char_In_String_Using_Hashmap;

public class b 
{
	public static void main(String[] args) 
	{
		String str= "Java is a programming Language";
		
		int totalcount= str.length();
		int countAfterReplace=str.replace("a", "").length();
		
		int count = totalcount-countAfterReplace;
		
		System.out.println("count a " + count ); 
		
	}

}
