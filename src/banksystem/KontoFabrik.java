package banksystem;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class KontoFabrik {
	static final Random random = new Random();

	public static List<Bankkonto> generiereKonto(int anzahl) {
		List<Bankkonto> konten = new ArrayList<>();
		for (int i = 0; i < anzahl; i++) {
			int kontonummer = 10000+random.nextInt(900000);
			double startguthaben = 10000+(100000-10000)*random.nextDouble();
			startguthaben = Math.round(startguthaben*100)/100.0;
			String kontoart = random.nextBoolean() ? "Girokonto" : "Sparkonto";
			if (kontoart.equals("Girokonto")) {
				Bankkonto konto = new Girokonto(String.valueOf(kontonummer), startguthaben);
				konten.add(konto);
			}else if(kontoart.equals("Sparkonto")) {
				Bankkonto konto = new Sparkonto(String.valueOf(kontonummer), startguthaben);
				konten.add(konto);
			}else throw new IllegalArgumentException("Error: no boolean value");
		}
		return konten;
	}
}
