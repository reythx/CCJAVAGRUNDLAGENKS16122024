package thema1.grundlagen;
import java.util.Scanner;

public class RechnerMitEingabe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gebe eine Zahl an: ");
		int z1 = scanner.nextInt();
		System.out.println("Gebe eine weitere Zahl an: ");
		int z2 = scanner.nextInt();
		
		System.out.println("Möchtest du addieren? Y / N");
		String answer = "k";
		answer = scanner.next();
			if(answer.equalsIgnoreCase("Y")) {
			RechnerOO.additionUndAusgabe(z1, z2);
			return;
			}else if(answer.equalsIgnoreCase("N")) {
				System.out.println("Möchtest du substrahieren? Y / N");
				answer = scanner.next();
					}if(answer.equalsIgnoreCase("Y")){
						RechnerOO.substraktionUndAusgabe(z1, z2);
						return;
				}else if(answer.equalsIgnoreCase("N")) {
					System.out.println("Möchtest du multiplizieren? Y / N");
					answer = scanner.next();
					}if(answer.equalsIgnoreCase("Y")) {
						RechnerOO.multiplizierenUndAusgeben(z1, z2);
						return;
				}else if(answer.equalsIgnoreCase("N")) {
						System.out.println("Möchtest du dividieren? Y / N");
						answer = scanner.next();
					}if(answer.equalsIgnoreCase("Y")) {
						RechnerOO.dividierenUndAusgeben(z1, z2);
						return;
				}else if(answer.equalsIgnoreCase("N")) {
					return;
						}
					scanner.close();
	}
				}
		
	


