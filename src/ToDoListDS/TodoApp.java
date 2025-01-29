package ToDoListDS;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class TodoApp {

	public static void main(String[] args) {
		// Hauptfenster
		JFrame frame = new JFrame("To-Do App (Eisenhower)");

		frame.setSize(800, 600);
		frame.setTitle("ToDo App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // wenn fenster geschlossen wird, wird das programm
																// beendet, vs HIDE_ON_CLOSE

		frame.setLayout(new BorderLayout());

		frame.setVisible(true); // Das Fenster anzeigen! normalerweise am ende, nach der anderen initialisierung
								// der anderen sachen
		// Hauptpanel für Eisenhower-Matrix
		JPanel squaresPanel = new JPanel(new GridLayout(2, 2));

		// Quadranten erstellen (jeweils ein JPanel)
		JPanel q1 = new JPanel();
		JPanel q2 = new JPanel();
		JPanel q3 = new JPanel();
		JPanel q4 = new JPanel();

		// Titel für Quadranten
		q1.setBorder(BorderFactory.createTitledBorder("Important & Urgent"));
		q2.setBorder(BorderFactory.createTitledBorder("Important & Not Urgent"));
		q3.setBorder(BorderFactory.createTitledBorder("Unimportant & Urgent"));
		q4.setBorder(BorderFactory.createTitledBorder("Unimportant & Not Urgent"));

		// quadrate zum Grid-Panel (Hauptpanel) hnzufügen
		squaresPanel.add(q1);
		squaresPanel.add(q2);
		squaresPanel.add(q3);
		squaresPanel.add(q4);

		// Grid-Panel ins hauptfenster setzten (Mitte)
		frame.add(squaresPanel, BorderLayout.CENTER);

		// Eingabe Panel (NORD)
		JPanel enterPanel = new JPanel(new FlowLayout()); // ordnet Komponenten hintereinander in einer Zeile (Standard
															// Layout)

		// Komponenten
		JTextField descriptionField = new JTextField(20);
		JComboBox<Priority> priorityCombo = new JComboBox<>(Priority.values()); // JComboBox = dropdown-menu in swing,
																				// mit liste von Optionen
		JComboBox<Urgency> urgencyCombo = new JComboBox<>(Urgency.values());
		JButton addButton = new JButton("Add");

		// Komponenten zum Panel hinzufügen
		enterPanel.add(new JLabel("Tasks"));
		enterPanel.add(descriptionField);
		enterPanel.add(new JLabel("Priorities"));
		enterPanel.add(priorityCombo);
		enterPanel.add(new JLabel("Urgency"));
		enterPanel.add(urgencyCombo);
		enterPanel.add(addButton);

		// Eingabe-Panel ins hauptfenster
		frame.add(enterPanel, BorderLayout.NORTH);

		// Listen erstellen für jedes Quadrat
		DefaultListModel<Task> modelQ1 = new DefaultListModel<Task>(); // Wird verwendet, um Daten in einer JList
																		// zu speichern (enthält Task objekte),
																		// verwendung der Verwaltung der Daten
		// verbindung der beiden Listen, JList braucht ListModel, um Elemente
		// datzustellen
		JList<Task> taskListQ1 = new JList<>(modelQ1); // Erstellt eine JList, die Liste von Task-Objekten anzeigt, also
														// zum speichern, in GUI anzuzeigen und interagieren

		q1.add(new JScrollPane(taskListQ1)); // ermöglicht Scroll-funktion für Swing-Komponenten (JList, JTextArea,
												// JTable etc)
		// ListCellRenderer für Q1 anpassen
		taskListQ1.setCellRenderer(new DefaultListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				JCheckBox checkBox = new JCheckBox(value.toString());
				checkBox.setSelected(((Task) value).isDone());
				return checkBox;
			}
		});

		// Q2
		DefaultListModel<Task> modelQ2 = new DefaultListModel<>();
		JList<Task> taskListQ2 = new JList<>(modelQ2);
		q2.add(new JScrollPane(taskListQ2));

		taskListQ2.setCellRenderer(new DefaultListCellRenderer());
		// getListCellRendererComponent muss nur einmal überschrieben werden!

		// Q3
		DefaultListModel<Task> modelQ3 = new DefaultListModel<>();
		JList<Task> taskListQ3 = new JList<>(modelQ3);
		q3.add(new JScrollPane(taskListQ3));

		taskListQ3.setCellRenderer(new DefaultListCellRenderer());

		// Q4
		DefaultListModel<Task> modelQ4 = new DefaultListModel<>();
		JList<Task> taskListQ4 = new JList<>(modelQ4);
		q4.add(new JScrollPane(taskListQ4));

		taskListQ4.setCellRenderer(new DefaultListCellRenderer());

		
		//Controller-Logik (Button-Action)
		addButton.addActionListener(e -> {
			//Aufgabe erstellen
			Task newTask = new Task(
				descriptionField.getText(),
				LocalDate.now().plusDays(7),	//Beispiel: Fällig in 7 Tagen
				(Priority) priorityCombo.getSelectedItem(),
				(Urgency) urgencyCombo.getSelectedItem()
				);
				
			//Zur ToDo Liste hinzufügen (backend)
			todoList.addTask(newTask);
			
			//Zur passenden JList hinzufügen
			switch(newTask.getPriority()+ "_" + newTask.getUrgency()) {
			case "WICHTIG_DRINGEND" -> modelQ1.addElement(newTask);
			}
		});
					
					
					
					
		
		
	}
}