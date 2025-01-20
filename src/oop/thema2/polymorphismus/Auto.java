package oop.thema2.polymorphismus;

public class Auto extends Fahrzeug{
	public void starte() {
		System.out.println("Auto.starte() aufgerufen");
	}
	
	public void klimaanlageEinschalten() {
		System.out.println("Klimaanlage eingeschaltet");
	}
}
