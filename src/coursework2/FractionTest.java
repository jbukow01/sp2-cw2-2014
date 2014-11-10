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

		// test addition JB
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(4, 16);
		Fraction c = new Fraction(3, 12);
		if (!a.equals(b.add(c)))
			System.out.println("Addition failed");

		// test subtraction JB
		Fraction m = new Fraction(1, 8);
		Fraction n = new Fraction(5, 20);
		Fraction o = new Fraction(2, 16);
		if (!m.equals(n.subtract(o)))
			System.out.println("Subtraction failed");

		// test multiply
		Fraction f = new Fraction(3, 10);
		Fraction g = new Fraction(1, 2);
		Fraction h = new Fraction(3, 5);
		if (!f.equals(g.multiply(h)))
			System.out.println("Multiply failed");

		// test division JB
		Fraction p = new Fraction(5, 16);
		Fraction q = new Fraction(1, 8);
		Fraction r = new Fraction(2, 5);
		if (!p.equals(q.divide(r)))
			System.out.println("Division failed");

		// test absolute value JB
		Fraction s = new Fraction(1, 2);
		Fraction t = new Fraction(-1, 2);
		if (!s.equals(t.absValue()))
			System.out.println("Values are not the same");

		// test negate JB
		Fraction u = new Fraction(1, 2);
		if (u.equals(u.negate()))
			System.out.println("Negation failed");
		Fraction w = new Fraction(-1, 2);
		if (w.equals(w.negate()))
			System.out.println("Negation failed");
		Fraction x = new Fraction(1, -2);
		if (x.equals(x.negate()))
			System.out.println("Negation failed");
		Fraction y = new Fraction(-1, -2);
		if (y.equals(y.negate()))
			System.out.println("Negation failed");

		// test toString JB
		Fraction ts = new Fraction(4, 1);
		String s1 = "" + ts;
		String s2 = "4";
		if (!s1.equals(s2)) {
			System.out.println("Fractions are not the same");
		}

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