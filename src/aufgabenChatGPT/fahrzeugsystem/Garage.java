package aufgabenChatGPT.fahrzeugsystem;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Fahrzeug> fahrzeuge;
	
	public Garage() {
		this.fahrzeuge = new ArrayList<>();
	}

	public void addFahrzeug(Fahrzeug zeug) {
		fahrzeuge.add(zeug);
		
	}
	public void removeFahrzeug(Fahrzeug zeug) {
		fahrzeuge.remove(zeug);
	}
	public void zeigeFahrzeuge() {
		System.out.println("Fahrzeuge in der Garage: ");
		for(int i = 0; i<fahrzeuge.size(); i++) {
			System.out.println(fahrzeuge.get(i).toString());
		}
	}
}
