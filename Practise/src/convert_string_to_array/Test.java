package convert_string_to_array;

public class Test {

	public static void main(String[] args) {
		
		String s="AVANI";
		
		char[] sa=s.toCharArray();
		
		for(int i=0; i<sa.length;i++) {
			System.out.print(sa[i]+ "_");
		}
		
	}
}
