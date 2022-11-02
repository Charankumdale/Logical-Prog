package CountNoOfDigits;

public class CountNoOfDigits {
	public static void main(String [] args) {
	    long number=12345678901234L;
		long count=0;
		
		
		while(number>0) {
			 number=number/10;
			 count++;			
		};
		System.out.println(count);
	}

}
