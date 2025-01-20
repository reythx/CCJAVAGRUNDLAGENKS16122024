package oop.thema4.datenstrukturen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListProgram {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list = Arrays.asList("A","b","C","D");
		
		
		System.out.println(list.get(2));
	}
}
