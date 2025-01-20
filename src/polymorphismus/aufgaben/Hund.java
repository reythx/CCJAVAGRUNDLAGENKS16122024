package polymorphismus.aufgaben;

public class Hund extends Saeugetier {

	public Hund(String name) {
		super(name);
	}
	
	void macheGeraeusch() {
		System.out.println("Wuff");
	}

	void bewegeDich() {
		System.out.println("Der Hund läuft..");
	}

	void spiele() {
		System.out.println("Der Hund spielt mit einem Ball.");
	}

}
