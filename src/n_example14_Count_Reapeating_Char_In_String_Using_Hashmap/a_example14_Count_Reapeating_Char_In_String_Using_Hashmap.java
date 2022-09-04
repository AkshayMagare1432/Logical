package n_example14_Count_Reapeating_Char_In_String_Using_Hashmap;

import java.util.HashMap;
import java.util.Set;

public class a_example14_Count_Reapeating_Char_In_String_Using_Hashmap {
	public static void main(String[] args) {

		String str = "abcaba";

		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
						
						//6<=5				
		for (int i = 0; i <= str.length() - 1; i++) 
		{								//4
			char charValue = str.charAt(i);   //a
			
			if (mp.containsKey(charValue))  //a   --true
			{
				mp.put(charValue, mp.get(charValue) + 1);  //a, 3
			} 
			else
			{
				mp.put(charValue, 1);   //b,1
			}

		}
		
		
		Set<Character> keys = mp.keySet(); //[a, b, c]
		
//		//print occurrence of each char
//		for (Character key : keys) 
//		{	
//			System.out.println(key +": "+ mp.get(key));
//		}
		
		
		
//		//print only duplicate element
		for (Character key : keys) 
		{
			if(mp.get(key)>1) 
			{
				System.out.println(key +": "+ mp.get(key));
			}
		}
		
		//System.out.println("a: "+ mp.get('a'));
		
	}

}
