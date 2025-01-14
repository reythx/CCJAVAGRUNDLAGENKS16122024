package thema7.vererbung;

public class QueenElizabeth extends Monarch {
	private String responsibility = "Head of State";
	protected static int anzahlAutos = 5;

	public void displayResponsibilities() {
		System.out.println("Responsibility: " + responsibility);
	}

}
