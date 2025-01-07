package thema2.datentypen;

public class PrimitiveDatatypes {

	public static void main(String[] args) {
		//a // char is smaller than short, cannot convert from char to short, short repräsentiert einen integer, char einen character
		char c1 = 'N'; short s1 = 'N'; short s11 = (short)c1; // fix indem short s11 = (short)c1, oder short s11 = s1
		System.out.println(s11);
		
	
		}

}


