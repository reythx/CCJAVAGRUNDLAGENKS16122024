package thema2.datentypen;

public class Ausklammern {

	public static void main(String[] args) {
		int a = 122;
		int b = 9;
		int c = 34;
		System.out.println((a+b) - (3*c)); //a
		System.out.println(a + b - 3 * c);
		int x = 23;
		int y = 5;
		int z = 3;
		System.out.println((4*x) / (y*z)); //b
		System.out.println(4*x / (y*z));
		int n = 2;
		int p = 3;
		System.out.println((x+3)*(n%p)); //c 
		System.out.println((x+3) * n%p + " Wrong result, kein Ausklammern möglich");	// no result
		
		System.out.println((-a) / (- (b+c))); //d
		System.out.println(-a / (- (b+c))); 
		
		System.out.println((x/y) % (-z)); //e
		System.out.println(x/y % -z);
		
		System.out.println((x/(y%(-z)))); //f
		System.out.println(x/(y%-z));
	}

}
