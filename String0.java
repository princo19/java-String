import java.util.Scanner;

public class String0 {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		//str="bye";
		//System.out.println(str);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		
		//Substring
		
		System.out.println(str.substring(0,3));
		System.out.println(str.substring(3,3));
		System.out.println(str.substring(str.length()-1));
		
		//Concating
		
		String s1="Hello" ;
		String s2="bye";
		String s3 = s1+s2;
		System.out.println(s3);
		System.out.println(s1.concat(s2));
		
		//IndexOf
		
		
		System.out.println(s1.indexOf("he"));
		System.out.println(s1.indexOf("He"));
		System.out.println(s1.indexOf("el"));
		
		
		//StartsWith
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.startsWith("he"));
		
		//equals
		
		String s4="BYEEE";
		String s5 = s4;
		String s6 = "BYEEE";
		String s7 = new String("BYEEE");
		System.out.println((s4==s5) +" "+ s4.equals(s5));
		System.out.println((s4==s6)+ " "+ s4.equals(s6));
		System.out.println((s4==s7)+ " "+ s4.equals(s7));
		Scanner scn = new Scanner(System.in);
		String ss = scn.nextLine();
		scn.close();
		
		takeInput(ss);
		}
	
	//input
	
	public static void takeInput(String str) {
		for(int i =0; i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
	

}
