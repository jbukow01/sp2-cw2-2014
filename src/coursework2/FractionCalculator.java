package coursework2;

import java.util.List;
import java.util.Arrays;

public class FractionCalculator {
	public static Fraction evaluate(Fraction frac, String inputString) {
		List<String> items = Arrays.asList(inputString.split(" "));
		int count = items.size();
		Fraction tempFrac = null;
		String operator = "";
		String modifier = "";

		// for loop to go through elements in the list
		for (int i = 0; i < count; i++) {
			String tempItem = items.get(i);
			if (isOperator(tempItem)) { // checking operators
				//if (operator == "") {
					operator = tempItem;
					frac = tempFrac;
				//} else {
					//System.out.println("Subsequent operators are not allowed");
				//}
			} else if (isModifier(tempItem)) { // checking modifiers
				modifier = tempItem;
			} else if (isFraction(tempItem)) { // checking fractions
				if (tempItem.contains("/")) {
					List<String> elements = Arrays.asList(tempItem.split("/"));
					int num = Integer.parseInt(elements.get(0));
					int denom = Integer.parseInt(elements.get(1));
					tempFrac = new Fraction(num, denom);
				} else { // checking integers and converting to fraction if true
					int num = Integer.parseInt(tempItem);
					int denom = 1;
					tempFrac = new Fraction(num, denom);
				}
			} else {
				System.out.println("Unknown error occured");
			}
			if (operator != "") {
				switch (operator) { // usage of switches imported from stackoverflow
				case "+":
					frac = frac.add(tempFrac);
					tempFrac = null;
					break;
				case "-":
					frac = frac.subtract(tempFrac);
					tempFrac = null;
					break;
				case "*":
					frac = frac.multiply(tempFrac);
					tempFrac = null;
					break;
				case "/":
					frac = frac.divide(tempFrac);
					tempFrac = null;
					break;
				}
			}

			if (modifier != "") {
				switch (modifier) {
				case "a":
					frac = frac.absValue();
					tempFrac = null;
				case "A":
					frac = frac.absValue();
					tempFrac = null;
				case "abs":
					frac = frac.absValue();
					tempFrac = null;

				case "n":
					frac = frac.negate();
					tempFrac = null;
				case "N":
					frac = frac.negate();
					tempFrac = null;
				case "neg":
					frac = frac.negate();
					tempFrac = null;

				case "c":
					frac = new Fraction(0, 1);
					tempFrac = null;
					tempItem = null;
				case "C":
					frac = new Fraction(0, 1);
					tempFrac = null;
					tempItem = null;
				case "clear":
					frac = new Fraction(0, 1);
					tempFrac = null;
					tempItem = null;

				case "q":
					frac = null;
					tempFrac = null;
					System.out.println("Goodbye");
					break;
				case "Q":
					frac = null;
					tempFrac = null;
					System.out.println("Goodbye");
					break;
				case "quit":
					frac = null;
					tempFrac = null;
					System.out.println("Goodbye");
					break;
				}
				modifier = "";
			}
		}
		return frac;
	}

	public static boolean isOperator(String operator) { // validation for operators
		String[] operators = { "+", "-", "*", "/" };
		return Arrays.asList(operators).contains(operator);
	}

	public static boolean isModifier(String modifier) { // validation for modifiers
		String[] modifiers = { "a", "A", "abs", "n", "N", "neg", "c", "C", "clear", "q", "Q", "quit" };
		return Arrays.asList(modifiers).contains(modifier);
	}

	public static boolean isFraction(String fraction) { // validation for fractions
		if (fraction.contains("/")) {
			List<String> elements = Arrays.asList(fraction.split("/"));
			if (isInteger(elements.get(0)) && isInteger(elements.get(1))) {
				return true;
			} else {
				return false;
			}
		} else if (isInteger(fraction)) { // validation for integers
			return true;
		} else {
			return false;
		}
	}

	public static boolean isInteger(String str) { // parsing string to integer
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}