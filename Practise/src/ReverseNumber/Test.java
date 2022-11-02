package ReverseNumber;

public class Test {

	
	public static void main(String[] args) {
		
		int a=123456789;
		int b;
		
		
		while(a>=1) {
			b=a%10;
			System.out.print(b);
			a=a/10;
		}
		
	}	
	
}
