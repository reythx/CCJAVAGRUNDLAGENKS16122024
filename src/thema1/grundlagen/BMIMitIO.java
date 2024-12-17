package thema1.grundlagen;

import utils.IO;

public class BMIMitIO {

	public static void main(String[] args) {
		System.out.println("Um BMI zu berechnen bite Daten angeben!");
		double height = IO.promptAndReadDouble("Bitte Groesse in Metern angeben: "); // Größe eingeben und Wert speichern
		double weight = IO.promptAndReadDouble("Bitte Gewicht in KG angeben: ");	// Gewicht eingeben und Wert speichern
		
		double bmi = weight / (height*height);										// BMI berechnen
		System.out.println("Ihr BMI ist " + IO.round(bmi, 0)); 						//BMI gerundet wiedergeben
	


}
}