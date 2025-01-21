package aufgabenChatGPT.ToDo;

public class ToDo implements Comparable<ToDo>{
	String task;
	
	public ToDo(String task) {
		this.task = task;
	}
	public String getTask() {
		return task;
	}
	
	public void setTask(String task) {
		this.task = task;
	}
	// Verlgeichsimplementierung
	@Override
	public int compareTo(ToDo other) {
		return this.task.compareTo(other.getTask());
	}

}
