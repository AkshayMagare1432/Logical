package d_Reverse_String;

public class e 
{
	public static void main(String[] args) 
	{
		String s1="Aniket";
		String s2="";
		String s3="apple";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.startsWith("A"));
		System.out.println(s1.endsWith("t"));
		
		System.out.println(s1.contains("n"));
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.charAt(2));
		System.out.println(s3.indexOf("p"));
		System.out.println(s3.lastIndexOf("p"));
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.replace("apple", "Mango"));
		
		System.out.println(s1.concat(s2));
		
		System.out.println("------------------------");
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		System.out.println(s2);
		
	}

}
