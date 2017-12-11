package test.children.game;

import static org.junit.Assert.*;

import org.junit.Test;

import excerise.ashwini.Child;
import excerise.ashwini.NumberDivisionRules;

public class NumberRulesTest {
	NumberDivisionRules numberRules = new NumberDivisionRules();

	@Test
	public void testNumberForThree() {
		int n = 1000;
		numberRules.getNumbersDivisableBy(3, n);

	}

	@Test
	public void testNumberForFive() {
		int n = 1000;
		numberRules.getNumbersDivisableBy(5, n);

	}

	@Test
	public void testNumberForThreeAndFive() {
		int n = 1000;
		numberRules.getNumbersDivisableBy(3,5, n);

	}
}
