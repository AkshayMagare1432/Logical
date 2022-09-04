package d_Reverse_String;

public class f 
{
	public static void main(String[] args) 
	{
//		String s1="VELOCITY";
//		String s2="";
//		
//		for(int i=s1.length()-1; i>=0; i--)
//		{
//			s2=s2+s1.charAt(i);
//		}
//		System.out.println(s2);
		
		String s = "abbcccdddd";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			int counter=0;
			char c=s.charAt(i);
			for(int j=0;j<s.length();j++){
				if(c==ch[j]){
					counter++;
					ch[j] = '\u0000'; // OR ch[j] = 0; 
				}
			}
			if(counter>0)
			System.out.println(c+" "+counter);
		}

		
	}

}
