package StarPattern;

import java.util.Scanner;

public class StarPattern2
{
	private static Scanner s;
	public static void main(String [] args)
	{
		s=new Scanner(System.in);
		int c;
		//c=column & r=row
		System.out.print("Enter No. of Values.");
		c=s.nextInt();
	    for(int a=1;a<=c;a++)
	    {
	    	for(int b=1;b<=a;b++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	}
}
