package thema7.vererbung;

public class PrinceCharles extends QueenElizabeth {
	private String firstName = "Charles";

	public void displayFullname() {
		System.out.println("Name: " + firstName + " " + familyName);
	}
}
