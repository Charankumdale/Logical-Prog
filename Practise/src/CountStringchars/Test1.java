package CountStringchars;

public class Test1 {

	public static void main(String[] args) {
		
		String s= "I am Charan & am an Engineer";
		
		char[] ca = s.toCharArray();
		int count=0;
		
		for(char c : ca) {
			
			if(c!=' ') {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
