package test.children.game;

import static org.junit.Assert.*;

import org.junit.Test;

import excerise.ashwini.Child;
import excerise.ashwini.Children;

public class ChildrenGameTest {
	Child child = new Child();

	@Test
	public void testCountGreater() {
		int n = 3, k = 8;
		boolean flag = child.validateInput(n, k);
		assertTrue("Inputs are not valid", flag);
		Child result = child.findtheWinner(n, k);
		assertTrue(result.id == 3);
	}

	@Test
	public void testSame() {
		int n = 8, k = 8;
		boolean flag = child.validateInput(n, k);
		assertTrue("Inputs are not valid", flag);
		Child result = child.findtheWinner(n, k);
		assertTrue(result.id == 4);
	}

	@Test
	public void testCountLesser() {
		int n = 9, k = 3;
		boolean flag = child.validateInput(n, k);
		assertTrue("Inputs are not valid", flag);
		Child result = child.findtheWinner(n, k);
		assertTrue(result.id == 1);
	}

	@Test
	public void noChildTest() {
		int n = 0, k = 0;
		boolean flag = child.validateInput(n, k);
		assertTrue("Inputs are  valid", !flag);

	}

	@Test
	public void singleCountTest() {
		int n = 9, k = 0;
		boolean flag = child.validateInput(n, k);
		assertTrue("Inputs are valid", !flag);

	}

	@Test
	public void singleChildTest() {
		int n = 1, k = 0;
		boolean flag = child.validateInput(n, k);
		assertTrue("Inputs are  valid", !flag);

	}
}
