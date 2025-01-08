package thema5.arrays;

public class ArrayProgram {

	public static void main(String[] args) {
		int[] ages = new int[3];
		ages[0] = 12;
		ages[1] = 22; //.......
		ages[2] = 23;

		// oder int[] ages = {12,22,2,30,50,99};
	
		
		//	System.out.println(ages[0]);, die ganze Liste kann so durchgenmmen werden 
		for(int i=0; i<ages.length; i++) {
			System.out.println(ages[i]); 
		}
		// gleiche schleife, andere ausführung, in o werden die einzelnen Elemente von ages gespeichert, ausgegeben -> überschreiben
		// geeignet für arrays, da o<ages, nicht <=
		for(int o : ages) {
			System.out.println(o);
		}
	}

}
