import java.util.Scanner;

import java.util.InputMismatchException;



public class Chapter12Part3 {
	

		private static double inputS = 0.0;

		private static Scanner keyboard = new Scanner(System.in);


		private static double inputV = 1.0;
	

		public static double sum() {
		
	do {
			
		System.out.println("Enter decimals and they will be added. End the series of numbers with a zero. ");
			
	try {
			
		inputV = keyboard.nextDouble();
			
		inputS += inputV;
			
	} catch(InputMismatchException e) {
	
			
		System.out.println("Wrong input. You must enter decimals only!");
	
			
		keyboard.next();
			
	}
		

	} while(inputV != 0);
		
		return inputS;
	
	}
	
		public static void main(String[] args) {

		
		sum();
		
		System.out.println("The sum of what you entered is: " + inputS);
	
	}

}
