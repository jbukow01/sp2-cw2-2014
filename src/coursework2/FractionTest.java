package coursework2;

/**
 * Created by keith for the second coursework assignment.
 * 
 * All the tests should be (re-)written using JUnit
 */
public class FractionTest {
	public static void main(String[] args) {

		// test divide by zero - should print an error and exit
		new Fraction(1, 2);
		
		// test multiply
		Fraction f = new Fraction(3, 10);
		Fraction g = new Fraction(1, 2);
		Fraction h = new Fraction(3, 5);
		if (!f.equals(g.multiply(h)))
			System.out.println("Multiply failed");
		
		// test addition
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(4, 16);
		Fraction c = new Fraction(3, 12);
		if (!a.equals(b.add(c)))
			System.out.println("Addition failed");
		
		// test subtraction
		Fraction m = new Fraction(1,8);
		Fraction n = new Fraction(5,20);
		Fraction o = new Fraction(2,16);
		if (!m.equals(n.subtract(o)))
			System.out.println("Subtraction failed");
		
		// test equals
		test(new Fraction(1, 2), new Fraction(1, 2), "error test 1");
		test(new Fraction(1, 2), new Fraction(3, 6), "error test 2");
		test(new Fraction(-1, 2), new Fraction(1, -2), "error test 3");
		test(new Fraction(-1, -2), new Fraction(1, 2), "error test 4");
		// test(new Fraction(4, -8),new Fraction(1, 2),"error test 5");

		// extend with extra tests
	}

	static void test(Fraction f1, Fraction f2, String msg) {
		if (!f1.equals(f2))
			System.out.println(msg);
	}
}