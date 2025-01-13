package oop.thema1.grundlagen;

public class HauptProgrammAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto("Mercedes", "AMG", 2013);

		
		
		auto1.fahren();
		auto2.fahren();
		auto2.setMarke("Opel");
		auto2.fahren();
		System.out.println(auto1);
	}

}
