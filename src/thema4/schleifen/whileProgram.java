package thema4.schleifen;

public class whileProgram {

	public static void main(String[] args) {
	int countdown = 10;
	while(countdown > 0) {
		System.out.println("Noch " + countdown + " Sekunden ...");
		countdown--;
		
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException e) {
			System.out.println("Fehler bei der Verzögerung: "+ e.getMessage());
		}
	}
		System.out.println("Start!");
	
	}

}
