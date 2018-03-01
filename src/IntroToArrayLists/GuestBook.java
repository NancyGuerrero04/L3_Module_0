package IntroToArrayLists;

=
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	public static void main(String[] args) {
		new GuestBook().setUp();

	}

	ArrayList<String> guestBookNames = new ArrayList<String>(); // member variable keep outside

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonAddName = new JButton();
	JButton buttonViewName = new JButton();

	private void setUp() {
		frame.addKeyListener(null);
		frame.add(panel);
		panel.add(buttonAddName);
		panel.add(buttonViewName);
		frame.setVisible(true);
		frame.pack();
		buttonAddName.setText("Add Name");
		buttonViewName.setText("View Names");
		buttonAddName.addActionListener(this);
		buttonViewName.addActionListener(this);

	}

	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name.
	public void actionPerformed(ActionEvent e) {
		System.out.println("h");
		if (e.getSource().equals(buttonAddName)) {
			
			String newName = JOptionPane.showInputDialog("Enter a name.");
			guestBookNames.add(newName);

		}
		
		if(e.getSource().equals(buttonViewName)) {
			for(int i = 0; i < guestBookNames.size(); i++){
				JOptionPane.showMessageDialog(null, "Guest #" + i + " " + guestBookNames.get(i) );
				
			}
			//JOptionPane.showMessageDialog(null, ");
		}
	}

	// Add that name to an ArrayList. When the "View Names" button is clicked,
	// display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	private static void GuestBook() {
		// TODO Auto-generated method stub

	}
}
