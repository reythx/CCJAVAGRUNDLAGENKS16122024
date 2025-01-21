package aufgabenChatGPT.ToDo;

import java.util.ArrayList;

public class ToDoList {
	public ArrayList<ToDo> myList = new ArrayList<>();

	public ToDoList(ToDo task) {
		this.myList.add(task);
	}

	public void addTask(ToDo task) {
		this.myList.addLast(task);
	}

	public void deleteTask(ToDo task) {
		myList.remove(task);
	}
	
	public void printTasks() {
		for(ToDo t : myList) {
			System.out.println(t);
		}
	}
	
	public void checkTask(ToDo task) {
		if(myList.contains(task)) {
			System.out.println(task + " ist bereits in der To-Do-Liste enthalten!");
		}
	}
	public void sortTasks() {
		for(ToDo i : myList) {
			System.out.println(i.getTask());
			
		}
	}
}
