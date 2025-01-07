package thema2.datentypen;

public class ASCIICodes {

	public static void main(String[] args) {
		/* char char1 = 'H';
		char char2 = 'e';
		char char3 = 'l';
		char char4 = 'l';
		char char5 = 'o';
		char char6 = ',';
		char char7 = ' ';
		char char8 = 'W';
		char char9 = 'o';
		char char10 = 'r';
		char char11 = 'l';
		char char12 = 'd';
		char char13 = '!';
		System.out.println("Zeichen\t ASCII-Wert");
		for(int i = 1; i <= 13; i++) {
			String varName = "char" + i;
			System.out.println(varName);
		}
		*/
		
		//2.5
		char[] chars = {
			'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'	
		};
		System.out.println("Zeichen\t\t ASCII-Wert");
		for(int i = 0; i < chars.length; i++) {
			System.out.println(chars[i] + "\t\t" + (int) chars[i]);
		}
		
	}

}
