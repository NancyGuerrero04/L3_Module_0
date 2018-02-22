package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 
	 
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer,String> Students = new HashMap<Integer, String>(); 
	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton addButton = new JButton();
		JButton searchButton = new JButton();
		JButton viewButton = new JButton();
		JButton removeButton = new JButton();
		
		private void setUp() {
		frame.add(panel);
		panel.add(addButton);
		panel.add(searchButton);
		panel.add(viewButton);
		panel.add(removeButton);
		
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource().equals(addButton)) {
				String newID = JOptionPane.showInputDialog("Enter your ID number.");
				int intNewID = Integer.parseInt(newID);
				String newName = JOptionPane.showInputDialog("Enter your name.");
				Students.put(intNewID, newName);
				
			} else if(e.getSource().equals(searchButton)) {
				String enteredID = JOptionPane.showInputDialog("Enter your ID number");
				int intNewID = Integer.parseInt(enteredID);	
				if(Students.containsKey(intNewID) == true) {
					
					
				}
			}
		}
}
