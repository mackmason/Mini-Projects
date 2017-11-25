import java.util.Scanner;

public class MiniProjects {
	
	static Scanner scan = new Scanner(System.in);
	static final String PI = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
	static String newPi = "3.";
	static String E = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274";
	static String newE = "2.";
	static int firstFibonacciNumber = 1;
	static int secondFibonacciNumber = 1;
	static int fibonacciNumber = 1;
	
	public static void getPi() {
		
		System.out.print("\nHow many decimal places would you like Pi to be represented in? ");
		int decimal = scan.nextInt();
		
		if (decimal > 100 || decimal < 0) {
			
			System.out.println("\n\tOut of Bounds Exception!");
			
		} else if (decimal == 0) {
			
			System.out.println("\nPi with " + decimal + " decimal place(s) is " + newPi);
		
		} else {
		
		for (int i = 2; i < decimal + 2; i++) {
			
			newPi += PI.charAt(i);
			
		}
	
		System.out.println("\nPi with " + decimal + " decimal place(s) is " + newPi + ".");
		
		}		
	}
	
	public static void getE() {
		
		System.out.print("\nHow many decimal places would you like E to be represented in? ");
		int decimal = scan.nextInt();
		
		if (decimal > 100 || decimal < 0) {
			
			System.out.println("\nOut of Bounds Exception!");
			
		} else if (decimal == 0) {
			
			System.out.println("\nE with " + decimal + " decimal place(s) is " + newE);
		
		} else {
		
		for (int i = 2; i < decimal + 2; i++) {
			
			newE += E.charAt(i);
			
		}
		
		System.out.println("\nE with " + decimal + " decimal place(s) is " + newE + ".");
		
		}
	
	}
	
	public static void getFibonacci() {
		
		System.out.print("\nWhich number would you like represented in the Fibonacci Sequence? ");
		int number = scan.nextInt();
		System.out.println("");
		
		if (number > 100 || number < 0) {
			
			System.out.println("\nOut of Bounds Exception!");
			
		} else {
		
			System.out.print("The Fibonacci Sequence containing " + number + " number(s) is:");
			
		for (int i = 0; i < number; i++) {
			
			System.out.print(" " + fibonacciNumber);
			
			fibonacciNumber = firstFibonacciNumber + secondFibonacciNumber;  
			
			secondFibonacciNumber = firstFibonacciNumber;
			firstFibonacciNumber = fibonacciNumber;
			
		}
		System.out.print(".");
		}
	
	}
	
		public static void main(String[] args) {
			
			getPi();
			
			getE();
			
			getFibonacci();
			
		}
	
}