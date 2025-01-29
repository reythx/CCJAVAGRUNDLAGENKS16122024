package ToDoListDS;

import javax.swing.*;
import java.time.LocalDate;

public class Task {
	private String description;
	private LocalDate dueDate;
	private LocalDate createdDate;
	private boolean isDone;
	private Priority priority;
	private Urgency urgency;

	public Task(String description, LocalDate dueDate, Priority priority, Urgency urgency) {
		this.description = description;
		this.createdDate = LocalDate.now(); // automatisch aktuelles datum
		this.dueDate = dueDate;
		this.priority = priority;
		this.urgency = urgency;
		this.isDone = false; // standardgemäß nicht erledigt
	}

	public boolean isDone() {return isDone;}
	public void setDone(boolean done) {this.isDone = done;}
	public String getDescription() {return description;}
	public LocalDate getDueDate() {return dueDate;}
	public LocalDate getCreatedDate() {return createdDate;}
	public Priority getPriority() {return priority;}
	public Urgency getUrgency() {return urgency;}

	@Override
	public String toString() {
		return "Description: " + description + ", Task due: " + dueDate + ", Task created: " + createdDate + ", Status: "
				+ isDone + ", Priority: " + priority + ", Urgency: " + urgency + "]";
	}
	
	
}
