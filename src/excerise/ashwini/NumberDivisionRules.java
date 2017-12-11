package excerise.ashwini;

import java.io.InputStream;
import java.util.Properties;

import numbers.resources.PatternConstatnts;

public class NumberDivisionRules {

	Properties prop = new Properties();
	InputStream input = null;

	public NumberDivisionRules() {
	}

	public void getNumbersDivisableBy(int a, int n) {
		System.out.println("\n\n Numbers Divisable by " + a + ":");
		for (int i = 0; i <= n; i++) {
			if (i % a == 0 && a == 3)
				System.out.print(+i + " " + PatternConstatnts.NUMBER_DIVISABLEBY_THREE + ", ");
			if (i % a == 0 && a == 5)
				System.out.print(+i + " " + PatternConstatnts.NUMBER_DIVISABLEBY_FIVE + ", ");
		}

	}

	public void getNumbersDivisableBy(int a, int b, int n) {
		System.out.println("\n\n Numbers Divisable by " + a + " and " + b + ":");
		for (int i = 0; i <= n; i++) {
			if (i % a == 0 && i % b == 0)
				System.out.print(+i + " " + PatternConstatnts.NUMBER_DIVISABLEBY_THREEANDFIVE + ", ");
		}

	}

	/* Future rules can be added here */
}
