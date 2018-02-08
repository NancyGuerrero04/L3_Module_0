import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class BandName {
	public static void main(String[] args) {
		ArrayList<String> adjectives = new ArrayList<String>();
		adjectives.add("Slimy");
		adjectives.add("Weird");
		adjectives.add("Messy");
		
		ArrayList<String> nouns = new ArrayList<String>();
		nouns.add("Mouse");
		nouns.add("Basement");
		nouns.add("Shoe");
		
		Random rand1 = new Random();
		int num1 = rand1.nextInt(adjectives.size());
		
		int num2 = rand1.nextInt(nouns.size());
		
		String myAdjective = adjectives.get(num1);
		String myNoun = nouns.get(num2);
		
		JOptionPane.showMessageDialog(null, myAdjective + " " + myNoun);
	}
	
}
