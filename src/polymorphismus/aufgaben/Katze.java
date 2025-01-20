package polymorphismus.aufgaben;

public class Katze extends Saeugetier {

	public Katze(String name) {
		super(name);
	}
	
	@Override
	void macheGeraeusch() {
		System.out.println("Miau!");

	}

	@Override
	void bewegeDich() {
		System.out.println("Die Katze schleicht..");

	}

	void spiele() {
		System.out.println("Die Katze spielt mit einem Wollknäuel.");
	}
}
