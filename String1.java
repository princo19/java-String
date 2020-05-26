import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		scn.close();
		printSS(str);

	}
	public static void printSS(String str) {
		for(int si=0;si<=str.length()-1;si++) {
			for(int ei=si+1;ei<=str.length();ei++) {
				String ss = str.substring(si,ei);
				System.out.println(ss+ " ");
			}
			
		}
		
		
	}
	

}
