package CountNoOfDigits;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				int number,count=0;
				
				System.out.println("Enter Numbers.");
				number=sc.nextInt();
				
				while(number>0) {
					number=number/10;
					count++;
				}
				System.out.println(count);
				
	  
	    
	   
		
		
	
	}

	

}
