package thema3.verzweigungen;

public class BiggestNumberSwitch {

	public static void main(String[] args) {
		System.out.println("*** Hier können Sie ihre größte Zahl ermitteln! ***");
		int n1 = 12;
		int n2 = 25;
		int n3 = 9;

		int max = Math.max(n1, Math.max(n2, n3));
	switch(max) {
	case 12:
		System.out.println("Die größte Zahl ist: " + n1);
		break;
	case 25:
		System.out.println("Die größte Zahl ist: " + n2);
		break;
	case 9:
		System.out.println("Die größte Zahl ist: " + n3);
		break;
	}
			
		
	}

}
