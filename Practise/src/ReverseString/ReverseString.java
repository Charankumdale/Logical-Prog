package ReverseString;

public class ReverseString {

	public static void main(String[] args) {
	  StringBuffer sb=new StringBuffer("jdc");
	  
	 // System.out.println(sb.reverse());
	  
	  String reverse="";
		String s=new String("JDC");
		
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			reverse=c+reverse;
		}
		System.out.println(reverse);
	}   
	
  }
 