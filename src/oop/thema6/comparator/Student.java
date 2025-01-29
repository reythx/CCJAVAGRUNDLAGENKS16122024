package oop.thema6.comparator;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private String vorname;

	public int getAge() {
		return age;
	}

	public String getVorname() {
		return vorname;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return this.name;
	}

	private String email;

	public Student(String vorname, String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.vorname = vorname;
		this.email = email;
	}

	@Override
	public int compareTo(Student other) {
		return Integer.compare(this.age, other.age); // Sortieren nach alter
	}

	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
}
