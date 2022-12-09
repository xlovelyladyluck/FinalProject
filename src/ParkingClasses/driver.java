package ParkingClasses;
import java.util.Scanner;

//use windows builder gui.


public class driver {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =15; i>0; i--) {
		System.out.println("Please enter how many days you would like to stay.");
		String userInput = sc.nextLine();
		PriorityQ.insert(userInput);
		}break;
		
		FinalizedList.(PriorityQ);
		
		System.out.println(PriorityQ.toString());
		
		
		
	}

}
