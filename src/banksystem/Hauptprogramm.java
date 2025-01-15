package banksystem;

public class Hauptprogramm {

	public static void main(String[] args) {
		// Teil1 OOP
//		Bank bank = new Bank();
//		bank.setName("Sparkasse");
//		bank.setAnzahlKonten(2);
//		Kunde kunde1 = new Kunde();
//		kunde1.setName("Max Mustermann");
//		kunde1.setAdresse("Poppelsdorfer Platz 2");
//		Kunde kunde2 = new Kunde("Anna Meier", "Clemens-August-Str. 27");
//		Bankkonto konto1 = new Bankkonto();
//		konto1.setKontonummer("123456");
//		konto1.setKontostand(1000.0);
//		konto1.setKundeninhaber(kunde1);
//		Bankkonto konto2 = new Bankkonto();
//		konto2.setKontonummer("654321");
//		konto2.setKontostand(2000.0);
//		konto2.setKundeninhaber(kunde2);
//		Bank.printBankInfo();
//		System.out.println();
//		System.out.println("Kundeninformationen:");
//		System.out.println(kunde1);
//		System.out.println(kunde2 + "\n");
//		System.out.println("Kontoinformationen:");
//		System.out.println(konto1);
//		System.out.println(konto2);
//
//		// Teil2	Objekte
//		Aktie aktie1 = new Aktie("MSFT456", "Microsoft Corp.", 280.0);
//		Aktie aktie2 = new Aktie("AAPL123", "Apple Inc.", 150.0);
//		System.out.println("\nAktieninformationen:\n" + aktie2);
//		System.out.println(aktie1);
//		aktie2.aktualisierePreis(220.5);
//		System.out.println(aktie2);
//
//		// Teil3	 Vererbung
//		Darlehensvertrag dar1 = new Darlehensvertrag();
//		dar1.setKreditnehmer(kunde1);
//		dar1.setKreditbetrag(10000.0);
//		dar1.setZinssatz(5);
//		dar1.setLaufzeit(12);
//		System.out.println(dar1);
//		dar1.berechneMonatlicheRate();
//		Darlehensvertrag dar2 = new Darlehensvertrag();
//		System.out.println(dar2);

//		Kunde kunde1 = new Kunde("Mary Jane");
//		Sparkonto spar = new Sparkonto();
//		spar.setKontonummer("123456");
//		spar.einzahlen(2000);
//		Girokonto giro = new Girokonto();
//		giro.setKontonummer("654321");
//		giro.setDispoLimit(500);
//		giro.einzahlen(3000);
//		giro.abheben(3500);
//		System.out.println(giro);
//		spar.abheben(20);
//		spar.getKontostand();
//		spar.setKundeninhaber(kunde1);
//		System.out.println(spar);

		// Interfaces
//		Zinsberechnung konto = new Sparkonto();
//		((Sparkonto) konto).einzahlen(200);
//		konto.berechneZinsen();
//		System.out.println("Kontostand: " + ((Sparkonto) konto).getKontostand() + " EUR");

		// Kundenliste
		Bank bank = new Bank("Sparkasse");
		Kunde kunde = new Kunde("Mary Jane", "Clemens-August-Straße 59");
		System.out.println(kunde);
		bank.addKunden(kunde);
		Kunde kunde1 = new Kunde("John", "Clemens-August-Platz 3");
		bank.addKunden(kunde1);
		Kunde kunde2 = new Kunde("Clemens", "Goethestraße 12");
		bank.addKunden(kunde2);
		bank.printKunden();
		Bankkonto konto = new Bankkonto("123", 200, kunde1);
		bank.addKonto(konto);
		Bankkonto konto2 = new Bankkonto("321", 230, kunde2);
		bank.addKonto(konto2);
		Bankkonto konto3 = new Bankkonto("2345", 49999, kunde);
		bank.addKonto(konto3);
		bank.printKonten();

		System.out.println(bank.searchKunde("K3"));
	}

}
