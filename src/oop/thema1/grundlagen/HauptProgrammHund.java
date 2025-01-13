package oop.thema1.grundlagen;

public class HauptProgrammHund {

	public static void main(String[] args) {
		//Unser Objekt
		Hund hund1 = new Hund();	// Hund(); = Konstruktur		// "new" erstellt ein neues Objekt
		System.out.println("Name: " + hund1.name);
		hund1.name = "ildar";			// Zustand ändern
		System.out.println("Name: " + hund1.name);
		
		
		//Änderung des Zustands
		hund1.alter = 2; 	

		

		//Anschauen des Verhalten			
		System.out.println("Familienstand ist: ");
		hund1.familienstand();
	
		Hund hund2 = new Hund();
		System.out.println("Name: " + hund2.name);
		System.out.println(hund2.rasse);
		hund2.fressen();
		
	}

}
