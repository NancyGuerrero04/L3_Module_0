package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		Stack <Double> stack = new Stack<Double>();
		//   Don't forget to import the Stack class. Done
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random ran = new Random(); 
		
		
		for(int i=0; i<100; i++) {
			double num = ran.nextDouble()*100;
			stack.push(num);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String inputFirst = JOptionPane.showInputDialog("Enter your first number.");
		int inputNumFirst = Integer.parseInt(inputFirst); 
		String inputSecond = JOptionPane.showInputDialog("Enter your second number.");
		int inputNumSecond = Integer.parseInt(inputSecond);

		
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		int size = stack.size();
		for(int i=0; i<size; i++) {
			double number = stack.pop();
			if(number> inputNumFirst && number<inputNumSecond) {
				System.out.println(number);
			} 
			//else if(number)
			
			
		}
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
