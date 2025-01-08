package thema4.schleifen;

public class WurzelziehenHalbieren {

	public static void main(String[] args) {
		
		double z = 16;
		int n = 20;
		double l = 0;
		double r = z;
		double m = 0;
		for(int i = 1; i<=n; i++) {
			m = (l + r) / 2;
			if(m*m < z) {
				l = m;
			}else {
				r = m;
			}
			System.out.println(i + l + r);
		}
		
		
	}

}
