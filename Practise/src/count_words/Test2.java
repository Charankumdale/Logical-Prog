package count_words;

public class Test2 {

	public static void main(String[] args) {
		
		String s= "I am Charan Kumdale";
		
		char[] ca = s.toCharArray();
		
		int count = 0;
		
		for(char c : ca) {
			
			if(c==' ') {
				count=count+1;
			}
		}
		System.out.println(count+1);
		
		
	}
}
