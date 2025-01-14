package banksystem;

public class Kunde {
	public String kundenId;
	public String name;
	public String adresse;

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
		return "Kunde: KundenID = " + kundenId + ", Name: " + name + ",\t Adresse: " + adresse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
