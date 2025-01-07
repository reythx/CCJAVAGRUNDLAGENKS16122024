package thema2.datentypen;

public class InkrementUndDekrement {

	public static void main(String[] args) {
		//2.6
		int i, j, n;
		i = 0; 
		n = i++;		// i wird n zugewiesen, also n = 0, danach wird i erhöht, also i = 1
		System.out.println("A : i = " + i + " n = " + n);	//	beim Abruf ist i bereits 1, aber n noch 0
		
		i = 10;
		n = ++i;	// i wird erhöht, dann n zugewiesen: n = 11
		System.out.println("B : i = " + i + " n = " + n);	// müsste i = 11 und n = 11 sein, da durch die initialisierung von n, auch i erhöht wird
		
		i = 20;
		j = 5;
		n = i++;	// n = 20, danach i = 21
		++j;	
		System.out.println("C : i = " + i + " j = " + j + " n = " + n); // i = 21, da durch n=i++ erhöht. j = 6, da inkrementiert, dann abgerufen, n = 20, da i noch 20 als n zugeordnet wurde
	
		i = 15; 
		n = i = i+=3;	//  i:15=18
		System.out.println("D : i = " + i + " n = " + n);	// i = 18, n = 18
		
		
	}

}
