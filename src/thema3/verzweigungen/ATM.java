package thema3.verzweigungen;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 346.14;
		System.out.println("Your Balance is " + balance + " Euro. \n How much money would you like to withdraw?");
		double amount = scanner.nextInt();
		
		if(balance - amount < 0) {
			System.out.println("No withdrawal possible! Chosen amount is greater than your balance.");
		}else {
			System.out.println("Processing Withdrawal...");
			balance -= amount;
			System.out.println("Your new balance is " + balance);
		}
		

	}

}
