package oop.thema4.datenstrukturen;

public class ListProgram {

	public static void main(String[] args) {
		// neue verkettetete Liste
		SinglyLinkedList list = new SinglyLinkedList();
		DoublyLinkedList list2 = new DoublyLinkedList();
		
		//Elemente adden
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		//anzeigen
		System.out.println("Inhalt der einfach verketteten Liste: ");
		list.display();
		System.out.println("Inhalt der doppelt verketteten Liste vorwärts: ");
		list2.displayForward();

	}

}
