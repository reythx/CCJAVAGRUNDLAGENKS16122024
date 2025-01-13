package oop.thema1.grundlagen;

public class Auto {	
	//Attribute
	 private String marke;
	 private String modell;
	 private String farbe;
	 private int baujahr;
	
		
	
	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	public Auto(){
		this.marke = "Auto";
		this.modell = "Unbekanntes Modells";
		this.baujahr = 2000;
		this.farbe = "Weiss";
	}
	
	public Auto(String marke, String modell, int baujahr){
		this();
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
	}
	
	public void fahren() {
		System.out.println(farbe + " " + marke + " " + modell + " aus " + baujahr + " fährt");
	}
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	@Override				// so kann man das Verhalten der String methode überschreiben, statt der ID kommt jetzt der String zurück (Bei syso(auto1));
	public String toString() {
		return "Auto: Marke= "+ marke + ", Modell= " + modell + ", Baujahr=" + baujahr ;
	}
	
}
