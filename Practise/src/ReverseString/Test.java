package ReverseString;

public class Test {

	public static void main(String[] args) {
		
		String s= "CharanKumdale";
		
		System.out.println(s.length());
		
		for(int i=s.length(); i>0; i--) {
			System.out.print(s.charAt(i-1));
		}
		
	}
}
