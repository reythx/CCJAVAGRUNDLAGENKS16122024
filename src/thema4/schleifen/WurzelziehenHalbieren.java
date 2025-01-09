package thema4.schleifen;

public class WurzelziehenHalbieren {

	public static void main(String[] args) {
		
		double z = 120;
		int n = 4;
		double l = 0;
		double r = z;
		for(int i = 1; i<=n; i++) {
			double m = (l + r) / 2;
			if(m*m < z) {
				l = m;
			}else {
				r = m;
			}
			System.out.println("Iteration: "+ i + ", l: " + Math.round(r*100.0)/100.0 + ", Wurzel: " + Math.round(r*100.0)/100.0);
		}
		
		
	}

}
