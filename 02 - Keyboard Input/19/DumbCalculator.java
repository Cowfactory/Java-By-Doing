import java.util.Scanner;

public class DumbCalculator {
	public static void main(String args[]) {
		double num1, num2, num3, finalNum;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This calculator rather uselessly adds three input numbers, and divides the sum by 2");
		
		System.out.print("What is your first number? ");
		num1 = keyboard.nextDouble();
		
		System.out.print("What is your second number? ");
		num2 = keyboard.nextDouble();
		
		System.out.print("What is your third number? ");
		num3 = keyboard.nextDouble();
		
		finalNum = (num1 + num2 + num3) / 2;
		finalNum = Math.floor(finalNum * 100) / 100;
		
		
		System.out.println("\n" + "( " 
			+ num1 + " + " + num2 + " + " + num3 +
			" ) / 2 is... " + finalNum );
	}
}