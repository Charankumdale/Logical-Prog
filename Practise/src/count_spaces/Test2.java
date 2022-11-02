package count_spaces;

public class Test2 {
	
	public static void main(String[] args) {
		
		String s=new String("I am Groot");
		
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==' ') {
				count+=1;
			}
		}
		System.out.println(count);
	}

}
