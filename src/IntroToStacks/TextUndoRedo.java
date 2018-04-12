package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should
	 * look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last
	 * character is erased from the JLabel. Save that deleted character onto a
	 * Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is
	 * pressed, the top Character is popped off the Stack and added back to the
	 * JLabel.
	 * 
	 */
	public static void main(String[] args) {
		TextUndoRedo tur = new TextUndoRedo();
		tur.setup();
	}

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	Stack<Character> stack = new Stack<Character>();

	public void setup() {
		f.add(p);
		p.add(l);
		f.setVisible(true);
		f.pack();
		f.addKeyListener(this);
		f.setSize(500, 50);
		// f.setPreferredSize(preferredSize);

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		String sub = l.getText();
		if (arg0.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

			if (sub.length() > 0) {
				char c = sub.charAt(sub.length() - 1);
				sub = sub.substring(0, sub.length() - 1);
				l.setText(sub);
				stack.push(c);

			} else {
				sub = sub.substring(0, sub.length());
				l.setText(sub);

			}

		} else if (arg0.getKeyCode() == KeyEvent.VK_0) {
			if (stack.isEmpty() == false) {
				Character character = stack.pop();
				l.setText(sub + character);
			}

		} else {
			char letter = arg0.getKeyChar();
			l.setText(l.getText() + letter);
			stack.clear();
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
