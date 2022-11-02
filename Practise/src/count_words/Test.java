package count_words;

public class Test {

	public static void main(String[] args) {
		
		String s= "I am Charan Kumdale";
		
		int count=0;
		
		char[] ca = s.toCharArray();
		
		for(char c : ca) {
			
			if(c==' ') {
				count+=1;
			}
		}
		System.out.println(count+1);
		
	}
}
