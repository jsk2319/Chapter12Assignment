import java.util.Scanner;



public class Chapter12{


	public static void main(String[] args) {
	
	
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter numbers and they will be added. End the series of numbers with a zero.");
	
		
		double inputV = 0.0;
		double inputS = 0.0;

		
		do {
			
		
			inputV = keyboard.nextDouble();
	
		
			inputS += inputV;
	
	
		} while(inputV != 0);
	
	
	System.out.println("The sum of what you entered is: " + inputS);
	
	
	}

}
