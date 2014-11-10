package coursework2;

import java.util.Scanner;

public class FractionCalculatorTest {
	
	public static void main(String[] args) {
		Fraction temp = new Fraction(0, 1);
		System.out.println("Welcome to JB calculator");
		System.out.println("Input: ");
		Scanner input = new Scanner(System.in);
		String calc = input.nextLine();
		System.out.println(FractionCalculator.evaluate(temp, calc));
	}
}