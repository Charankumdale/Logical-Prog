package CountNoOfDigits;

public class Test2 {

	public static void main(String[] args) {
		
		double a=52345678901234567892546d;
		
		int count=0;
		
		while(a>=1) {
			a=a/10;
			count++;
		}
		
		System.out.println(count);
	}
}
