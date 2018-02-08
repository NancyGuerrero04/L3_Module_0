import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class ComedtCentral {
	public static void main(String[] args) {
		ArrayList<String> jokes = new ArrayList<String>();
		jokes.add("Can a kangaroo jump higher than a house?");
		jokes.add("Why did the chicken cross the road?");
		jokes.add("What's sticky and brown?");
		
		ArrayList<String> punchlines = new ArrayList<String>();
		punchlines.add("Of course! A house can't jump.");
		punchlines.add("To get to the other side.");
		punchlines.add("A stick.");
		
		Random rand1 = new Random();
		int num = rand1.nextInt(jokes.size());
		String myJoke = jokes.get(num);
		String punchline = punchlines.get(num);
		
		JOptionPane.showMessageDialog(null, myJoke);
		JOptionPane.showMessageDialog(null, punchline);
		
		
		

		}
}
