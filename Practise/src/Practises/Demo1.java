package Practises;

public class Demo1 {
	public static void main(String[] args) {
		
		String reverse="";
		String s=new String("JDC");
		
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			reverse=c+reverse;
		}
		System.out.println(reverse);
	}   

}
