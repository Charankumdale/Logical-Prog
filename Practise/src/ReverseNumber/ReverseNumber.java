package ReverseNumber;

public class ReverseNumber {
	public static void main(String [] args) {
	   long a=12345678901234567L , b ;
	   
	  
	  while(a>=1) {
		  
		  b=a%10; 
		  System.out.print(b);
		  a=a/10;	  
	  }	
	}
}
