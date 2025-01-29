package oop.thema4.datenstrukturen;

public class Person implements Comparable<Person> {
	private String vorname;
	private String Nachname;
	private String email;
	private int alter;

	public Person(String vorname, String nachname, String email, int alter) {
		super();
		this.vorname = vorname;
		Nachname = nachname;
		this.email = email;
		this.alter = alter;
	}
	public Person(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.Nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", Nachname=" + Nachname + ", email=" + email + ", alter=" + alter + "]";
	}

	@Override
	public int compareTo(Person s1) {
		//logik was kleiner als...
		int nachNameVergleich = this.Nachname.compareTo(s1.Nachname);
		if(nachNameVergleich != 0) {
			return nachNameVergleich;
		}
		// Falls nachnamen gleich, nach vorname sortieren
		return this.vorname.compareTo(s1.vorname);
		}
}
