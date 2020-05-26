
public class String2 {

	public static void main(String[] args) {
		int n= 100000;
		StringBuilder str = new StringBuilder();
		long start = System.currentTimeMillis();
		for(int i =1;i<=n;i++) {
			str.append(i);
//			System.out.println(str);
			
			
		}
		long end = System.currentTimeMillis();
		System.out.println(start-end);
	}

}
