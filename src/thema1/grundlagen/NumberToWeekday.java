package thema1.grundlagen;

import java.util.Scanner;

public class NumberToWeekday {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int day = -1;
		System.out.println("*** Welcome to the Number to Weekday converter! ***");
	
		while(true) {	//loop to repeatedly show intro line and exit options
		
			System.out.println("Please enter a number between 1 and 7 to learn what weekday it correlates to! \nEnter 0 to exit");
			day = scanner.nextInt();
				
			if(day == 0) {				//end program if 0
					System.out.println("Program ended.");
					break;
			}
			if(day >=1 && day <= 7) {	//choose number between 1 and 7
				switch(day) {
				case 1: 
					System.out.println("You chose Monday!");
					break;
				case 2: 
					System.out.println("You chose Tuesday!");
					break;
				case 3: 
					System.out.println("You chose Wednesday!");
					break;
				case 4: 
					System.out.println("You chose Thursday!");
					break;
				case 5: 
					System.out.println("You chose Friday!");
					break;
				case 6: 
					System.out.println("You chose Saturday!");
					break;
				case 7: 
					System.out.println("You chose Sunday!");
					break;
				}
			}else {
				System.out.println("Error: Outside of range");
			}

			
		System.out.println("Do you want check more numbers?");
		
		}
		scanner.close();
	}
}
