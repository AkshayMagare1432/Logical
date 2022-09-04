package m_example13_Reverse_middle_String;

public class a 
{
	public static void main(String[] args) {
//		
//		String s = "life is beautiful enjoy it";
//		char[] letters = s.toCharArray();
//		int count = 0;
//		for(char c : letters){
//			switch(c){
//				case 'a' :
//				case 'e' :
//				case 'i' :
//				case 'o' :
//				case 'u' :
//					count++;
//					break;
//					default:
//			}
//		}
//		System.out.println("Total Vowels in String = "+count);

	String s = "aabbbcdddd";
	char ch[] = s.toCharArray();
	for(char c : ch){
		if(s.indexOf(c)==s.lastIndexOf(c)){
			System.out.println("First non-repeat char = "+c);
			break;
		}
	}

	}
}
