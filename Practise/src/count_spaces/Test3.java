package count_spaces;

public class Test3 {

	public static void main(String[] args) {
		
		String s ="I am Charan Ramrao Kumdale";
		
		int count=0;
		
		char[] ca = s.toCharArray();
		
		for(char c : ca) {
			
			if(c==' ') {
				count=count+1;
			}
		}
		
		System.out.println("spaces= "+count);
		System.out.println("Words= "+(count+1));
	}
}
