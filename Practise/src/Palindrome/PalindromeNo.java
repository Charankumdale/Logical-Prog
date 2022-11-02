package Palindrome;

import java.util.Scanner;

public class PalindromeNo {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Numbers");
		int no,i, rem, rev;
		no=s.nextInt();
		i=no;
		rev=0;
		
		while(i>0) {
			rem=i%10;
			rev=rev*10+rem;
			i=i/10;
		}
		
		if(no==rev) {
			System.out.println(rev+": Number is Palindrome.");
		}else {
			System.out.println(rev+": Number is not Palindrome.");
		}
		
	}
}
