package banksystem;

public class Bank {
	static String name;
	static int anzahlKonten;
	
	public Bank() {
		this.name = "unbekannt";
		this.anzahlKonten = 1;
	}
	public Bank(String name, int anzahlKonten) {
		this();
		this.name = name;
		this.anzahlKonten = anzahlKonten;
	}
	
	static void printBankInfo() {
		System.out.println("Bank: " + name);
		System.out.println("Anzahl der Konten: " + anzahlKonten);
	}
}
