package ToDoListDS;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class TodoList {
	private Map<Integer, Task> tasks;
	private int idCounter;
	
	public TodoList() {
		tasks = new TreeMap<>();
		idCounter = 1;
	}
	
	//Aufgabe erledigen
	public void markTaskAsDone(int taskId) {
		Task task = tasks.get(taskId);
		if(task != null) {
			task.setDone(true);
		}
	}
	//add task
	public void addTask(Task task) {
		String square = determineSquare(task);
		tasks.put(idCounter++, task);
	}
	
	
	//alle aufgaben anzeigen
	public void displayTasks() {
		for(Map.Entry<Integer, Task> entry : tasks.entrySet()) {
			System.out.println("ID: " + entry.getKey() + " - " + entry.getValue());
		}
	}
	 // Bestimmt den Quadranten der Aufgabe basierend auf Priorität und Dringlichkeit
    private String determineSquare(Task task) {
        if (task.getPriority() == Priority.HIGH && task.getUrgency() == Urgency.HIGH) {
            return "Important & Urgent";
        } else if (task.getPriority() == Priority.HIGH && task.getUrgency() == Urgency.LOW) {
            return "Important & Not Urgent";
        } else if (task.getPriority() == Priority.LOW && task.getUrgency() == Urgency.HIGH) {
            return "Unimportant & Urgent";
        } else {
            return "Unimportant & Not Urgent";
        }
    
}
}