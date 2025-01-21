package aufgabenChatGPT.fahrzeugsystem;

public class Hauptprogramm {

	public static void main(String[] args) {
		
		Garage liste = new Garage();
		Auto f1 = new Auto("BMW", 2001, 50);
		Motorrad f2 = new Motorrad("Harley", 2005, 250);
		Auto f4 = new Auto("Opel", 1999, 60);
		
		liste.addFahrzeug(f4);
		liste.addFahrzeug(f1);
		liste.addFahrzeug(f2);
		
		f4.setAnzahlSitze(4);
		f1.setKraftstoffTyp("Elektro");
		f4.setKraftstoffTyp("Diesel");
		f2.setHubraum(150);
		
		f2.zeigeInfo();
		liste.zeigeFahrzeuge();
		f2.beschleunigen(299);
		liste.zeigeFahrzeuge();
		f2.bremsen(100);
		f1.zeigeInfo();
		f1.berechneSteuer();
		
	}

}
