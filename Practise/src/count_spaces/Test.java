package count_spaces;

public class Test {
	
	public static void main(String[] args) {
		String s=new String("Once upon a time there");
		   
		   int count= 0 ;
		   for(int i=0;i<s.length();i++) {
			  
			   if(s.charAt(i)==' ') {
				   count++;
			    }
		  }
		          System.out.println(count);
	}

}
