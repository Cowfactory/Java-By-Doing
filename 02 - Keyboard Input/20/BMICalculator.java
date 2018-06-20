import java.util.Scanner;
import java.text.DecimalFormat;

public class BMICalculator {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		final double feetToMeters = 0.305;
		final double poundsToKilos = 0.453592;
		
		//BMI calculation: mass(kg) / height(m^2)
		int feet, inches, pounds;
		
		//Taking measurements
		System.out.print("Your height(feet only): ");
		feet = sc.nextInt();
		
		System.out.print("Your height(inches): ");
		inches = sc.nextInt();
		
		System.out.print("Your weight in pounds: ");
		pounds = sc.nextInt();
		
		//Calculating BMI
		double heightInMeters = (feet + (double)inches/12) * feetToMeters;
		double massInKilos = pounds * poundsToKilos;
		double bmi = massInKilos / (heightInMeters * heightInMeters);
		
		System.out.print("Your BMI is " + df.format(bmi));
	}
}
