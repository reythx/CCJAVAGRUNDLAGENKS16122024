package oop.thema4.datenstrukturen.enums;

public class Main {

	public static void main(String[] args) {

		Wochentag tag = Wochentag.DONNERSTAG;
		
		//ENUM mit switch-case:
		
		
		switch(tag) {
		case MONTAG:
			System.out.println("Wochenstart! Zeit für Arbeit");
			break;
		case DIENSTAG:
			System.out.println();
		case MITTWOCH:
			System.out.println();
			break;
		case DONNERSTAG:
			System.out.println();
			break;
		case FREITAG:
			System.out.println();
			break;
		case SAMSTAG:
			System.out.println();
			break;
		case SONNTAG:
			System.out.println();
			break;
		}
		
		
	}

}
