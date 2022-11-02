package Practises;


public class Test {
         
	
	class Inner{
		public void add() {
			System.out.println("add method");
			Nested n=new Nested();
			n.m1();
		}		
	}
	static class Nested{
		int a=10;
		String method="String";
		
		public void m1() {
			System.out.println(a);
			System.out.println(method);
		}
	}
	  public static void main(String[] args) {
		Test t=new Test();
		Inner i=t.new Inner();
		i.add();
	}
}
