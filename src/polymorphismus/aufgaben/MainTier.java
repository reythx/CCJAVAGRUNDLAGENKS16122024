package polymorphismus.aufgaben;

public class MainTier {

	public static void main(String[] args) {
		Saeugetier[] liste = new Saeugetier[20];

		Saeugetier hund = new Hund("Bello");
		Saeugetier katze = new Katze("Mietzi");
		liste[1] = hund;
		liste[2] = katze;

		for (int i = 0; i < liste.length; i++) {
			if (liste[i] != null) {
				System.out.println(liste[i].getName());
				liste[i].macheGeraeusch();
				liste[i].bewegeDich();
				;
			}
			if (liste[i] != null && liste[i] instanceof Katze) {
				((Katze) liste[i]).spiele();
			} else if (liste[i] != null && liste[i] instanceof Hund) {
				((Hund) liste[i]).spiele();
			}

		}
	}
}