package banksystem;

public class Kunde {
	String kundenId;
	String name;
	String adresse;

	private static int idCounter = 0;

	public Kunde() {
		this.kundenId = "K" + (++idCounter);
		this.name = "Unknown" + (this.idCounter);
		this.adresse = "Unbekannt";
	}

	public Kunde(String name, String adresse) {
		this.kundenId = "K" + (++idCounter);
		this.name = name;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Kunde: " + name + ",\t Adresse: " + adresse;
	}
}
