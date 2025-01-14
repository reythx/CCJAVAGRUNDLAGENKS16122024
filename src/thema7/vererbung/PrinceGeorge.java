package thema7.vererbung;

public class PrinceGeorge extends PrinceWilliam {
	private int anzahlFliegendeAutos = 9;

	public void displayAutos() {
		System.out.println("Anzahl Autos: " + (anzahlAutos + anzahlFliegendeAutos));
	}
}
