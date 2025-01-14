package banksystem;

public class Bank {
	private static String name; // attribute die static sind als private initialisieren!
	private static int anzahlKonten;

	public Bank() {
		this.name = "unbekannt";
		this.anzahlKonten = 1;
	}

	public Bank(String name, int anzahlKonten) {
		super();
		this.name = name;
		this.anzahlKonten = anzahlKonten;
	}

	public static void setName(String name) {
		Bank.name = name;
	}
	public static String getName() {
		return Bank.name;
	}
	
	public static int getAnzahlKonten() {
		return Bank.anzahlKonten;
	}

	public static void setAnzahlKonten(int anzahlKonten) {
		Bank.anzahlKonten = anzahlKonten;
	}

	static void printBankInfo() {
		System.out.println("Bank: " + name);
		System.out.println("Anzahl der Konten: " + anzahlKonten);
	}

}
