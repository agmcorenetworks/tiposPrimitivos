package introduccion;

public class Suma {

	int n0=5;
	static int n1=10;
	
	public void test2() {
		n0=9;
		n1=3;
	}
	
	public static void test() {
				
		int i=5;
		System.out.println(i++);
		
		
		System.out.println(++i);				
	}
	
	public static void main (String [] args) {
		test();	
		
		int num=5;
		num=num<<1;		
		System.out.println(num);
	}
}
