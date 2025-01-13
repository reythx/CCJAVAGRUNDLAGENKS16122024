package banksystem;

public class Hauptprogramm {

	public static void main(String[] args) {
		Bank bank = new Bank("Sparkasse", 2);
		Kunde kunde1 = new Kunde("Max Mustermann", "Auf dem Schlee 1");
		Kunde kunde2 = new Kunde("Anna Meier", "Clemens-August-Str. 27");
		Bankkonto konto1 = new Bankkonto("123456", 1000.0, kunde1);
		Bankkonto konto2 = new Bankkonto("654321", 2000.0, kunde2);
		
		Bank.printBankInfo();
		System.out.println("Kundeninformationen:\n" + kunde1 + "\n"+ kunde2 + "\nKontoinformationen:\n" + konto1 + "\n" + konto2);

	}

}
