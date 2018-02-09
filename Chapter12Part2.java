import java.util.Scanner;

import java.util.InputMismatchException;


public class Chapter12Part2 {


	public static void main(String[] args) {


		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter numbers and they will be added. End the series of numbers with a zero.");
	

		double inputV = 1.0;
 		double inputS = 0.0;


		do {
			
			System.out.println("Enter a number: ");
			
		try {
				
			inputV = keyboard.nextDouble();
	
			
			inputS += inputV;
	
		
		} catch (InputMismatchException e){


			System.out.println("Wrong input. You must enter decimals only!");

	
			keyboard.next();
			
		}
		

		} while(inputV != 0);

		
		System.out.println("The sum of what you entered is " + inputS);
	
	}

}
