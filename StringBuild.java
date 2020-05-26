
public class StringBuild {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.append("abc"));
		System.out.println(sb);
		System.out.println(sb.insert(2, "bc"));
		System.out.println(sb.deleteCharAt(2));
		//System.out.println(sb.setCharAt(4, 'e'));
		//System.out.println(sb.setCharAt(2,'w'));
		sb.setCharAt(2, 'w');
		System.out.println(sb);
		
		
		
		

	}

	
	

}
