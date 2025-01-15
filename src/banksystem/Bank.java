package banksystem;

public class Bank {
	private static String name; // attribute die static sind als private initialisieren!
	private static int anzahlKonten;
	private Kunde[] kundenListe = new Kunde[100];
	private Bankkonto[] konten = new Bankkonto[100];

	public Bank() {
		this.name = "unbekannt";
		this.anzahlKonten = 1;
	}

	public Bank(String name, int anzahlKonten) {
		super();
		this.name = name;
		this.anzahlKonten = anzahlKonten;
	}

	public Bank(String name) {
		super();
		this.name = name;
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

	public void addKunden(Kunde kunde) {
		for (int i = 0; i < kundenListe.length; i++) {
			if (kundenListe[i] == null) {
				kundenListe[i] = kunde;
				break;
			}
		}
	}

	public String searchKunde(String id) {
		for (int i = 0; i < kundenListe.length; i++) {
			if (kundenListe[i] != null && id.equals(kundenListe[i].kundenId)) {
				return "Kundeninformationen zu KundenID " + id + ": " + kundenListe[i].toString();
			}
		}
		return null;
	}

	public void addKonto(Bankkonto konto) {
		for (int i = 0; i < konten.length; i++) {
			if (konten[i] == null) {
				konten[i] = konto;
				break;
			}
		}
	}

	public void printKonten() {
		for (int i = 0; i < konten.length; i++) {
			if (konten[i] != null) {
				System.out.println("Bankkonto " + i + ": " + konten[i].toString());
			}
		}
	}

	public void printKunden() {
		for (int i = 0; i < kundenListe.length; i++) {
			if (kundenListe[i] != null) {
				System.out.println("Kunde " + i + ": " + kundenListe[i]);
			}
		}
	}

}
