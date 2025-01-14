package banksystem;

public class Hauptprogramm {

	public static void main(String[] args) {

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
//		// Teil2
//		Aktie aktie1 = new Aktie("MSFT456", "Microsoft Corp.", 280.0);
//		Aktie aktie2 = new Aktie("AAPL123", "Apple Inc.", 150.0);
//		System.out.println("\nAktieninformationen:\n" + aktie2);
//		System.out.println(aktie1);
//		aktie2.aktualisierePreis(220.5);
//		System.out.println(aktie2);
//
//		// Teil3
//		Darlehensvertrag dar1 = new Darlehensvertrag();
//		dar1.setKreditnehmer(kunde1);
//		dar1.setKreditbetrag(10000.0);
//		dar1.setZinssatz(5);
//		dar1.setLaufzeit(12);
//		System.out.println(dar1);
//		dar1.berechneMonatlicheRate();
//		Darlehensvertrag dar2 = new Darlehensvertrag();
//		System.out.println(dar2);
		
		Kunde kunde1 = new Kunde("Maxxi", "Clemens Augustin Str 31");
		
		Sparkonto sparkonto = new Sparkonto();
		sparkonto.setKundeninhaber(kunde1);
		System.out.println("Initiales sparkonto: "+sparkonto);
		sparkonto.setSparkontostand(2000.0);
		sparkonto.einzahlen(200);
		System.out.println("Aktueller kontostand nach einzahlung: "+sparkonto.getKontostand());
		sparkonto.abheben(100);
		System.out.println(sparkonto.getKontostand());
		sparkonto.zinsenBerechnen();
		System.out.println(sparkonto.getKontostand());
		Girokonto giro = new Girokonto();
		giro.setKontostand(5000);
		giro.setKundeninhaber(kunde1);
		giro.setDispoLimit(200.0);
		System.out.println(giro.getKontostand());
		System.out.println(giro);
		giro.abheben(5500);
		System.out.println(giro);
		giro.abheben(5201);
		System.out.println(giro);
	
	}

}
