package thema5.arrays;
import java.util.Random;

public class RandomProgram {

	public static void main(String[] args) {
		int[] randomNumb;
		randomNumb = new int[1000];
		Random random = new Random();
		
		for(int i = 0; i<randomNumb.length; i++) {
			randomNumb[i] = random.nextInt(1, 200);
			System.out.println(randomNumb[i]);
		}
	}

}
