package aufgabenChatGPT.hash1;

import java.util.HashMap;

public class KeyAndValue {
	public static void main(String[] args) {
		HashMap<String, Integer> people = new HashMap<>();

		people.put("Kevin", 28);
		people.put("Ilja", 30);
		people.put("Arne", 29);
		people.put("Gold", 42);
		people.put("Istvan", 34);
	}

	public static int returnAge(HashMap<String, Integer> map, String name) {
		if(map.containsKey(name)){
			return map.get(name);
		}else {
			System.out.println("Person nicht gefunden");
			return -1;
		}
	}

}
