package count_spaces;

public class Test4 {

	public static void main(String[] args) {
		
		String s= "I am Charan ";
		
		char[] ca = s.toCharArray();
		int count=0;
		for(char c : ca) {
			if(c==' ') {
				count=count+1;
			}
		}
		
		System.out.println(count);
		
	}
}
