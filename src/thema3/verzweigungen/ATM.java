package thema3.verzweigungen;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 346.14;
		System.out.println("Your Balance is " + balance + " Euro. \nHow much money would you like to withdraw?");
		double amount = scanner.nextDouble();
		int status = 0;
		while (status == 0) {
		if (balance - amount < 0) {
			System.out.println("No withdrawal possible! Chosen amount is greater than your balance.");
			System.out.println("Bitte neuen betrag eingeben:");
			amount = scanner.nextDouble();
		}
		 else {
			System.out.println("Processing Withdrawal...");
			balance -= amount;
			System.out.println("Your new balance is " + balance);
			status = 1;
		}}
		scanner.close();
	}
}