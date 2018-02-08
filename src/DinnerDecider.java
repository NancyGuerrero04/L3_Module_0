import java.util.ArrayList;
import java.util.Random;

public class DinnerDecider {
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("hamburger");
		food.add("salad");
		Random ran = new Random(); 
		int num = ran.nextInt(food.size()); 
		String myFood = food.get(num);
		
		System.out.print("You should eat " + myFood + " tonight!");
		
		
		
	}
	

}
