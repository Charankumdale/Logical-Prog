package CountStringchars;

public class CountStringChars {
	public static void main(String[] args) {
		
	

	String s=new String("complete java development class");
	   
	   int count= 1 ;
	   for(int i=1;i<s.length();i++) {
		  
		   if(s.charAt(i)==' ') {
			   count++;
		    }
	  }
	          System.out.println(count); 
   }
}
