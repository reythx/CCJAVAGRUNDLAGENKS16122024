package banksystem;

import java.util.ArrayList;

public class Bank {
	private static String name; // attribute die static sind als private initialisieren!
	private static int anzahlKonten;
	private Kunde[] kundenListe = new Kunde[100];
	private ArrayList<Bankkonto> konten = new ArrayList<>();

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

	public Bankkonto getKonto(String kontonummer) {
		for (int i = 0; i < konten.size(); i++) {
			if (konten.get(i).getKontonummer().equals(kontonummer)) {
				return konten.get(i);
			}
		}
		return null;
	}

	public void zeigeAlleKonten() {
		for (int i = 0; i < konten.size(); i++) {
			System.out.println(konten.get(i));

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
		konten.add(konto);
		System.out.println("Konto " + konto.getKontonummer() + " hinzugefügt");
	}

	public void removeKonto(String kontonummer) {
		for (int i = 0; i < konten.size(); i++) {
			if (konten.get(i).getKontonummer().equals(kontonummer)) {
				konten.remove(i);
				System.out.println("Konto mit der Kontonummer " + kontonummer + " entfernt.");
				break;
			}
		}

	}

	public void printKonten() {
		for (int i = 0; i < konten.size(); i++) {
			if (konten.get(i) != null) {
				System.out.println("Bankkonto " + i + ": " + konten.get(i));
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
