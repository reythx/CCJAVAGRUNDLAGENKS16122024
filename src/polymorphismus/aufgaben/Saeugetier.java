package polymorphismus.aufgaben;

public abstract class Saeugetier {
	public String name;


	public Saeugetier(String name) {
		this.name = name;
	}

	public Saeugetier() {
		this.name = name + 1;
	}

	public String getName() {
		return this.name;
	}

	abstract void macheGeraeusch();

	abstract void bewegeDich();
}
