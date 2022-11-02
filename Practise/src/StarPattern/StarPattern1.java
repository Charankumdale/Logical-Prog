package StarPattern;

import java.util.Scanner;

public class StarPattern1{
	
	
	private static Scanner s;

	public static void main(String [] args) 
	{
		
		s = new Scanner(System.in);
		int c,r;
		//c=column & r=rows
		System.out.print("Enter No. of Column.");
		c=s.nextInt();
		System.out.print("Enter No. of Rows.");
		r=s.nextInt();
		for(int a=1;a<=c;a++)
		{
          for(int b=1;b<=r;b++)
          {
        	System.out.print("* ");  
          }
          System.out.println();
		}
	}
}