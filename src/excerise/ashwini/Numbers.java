package excerise.ashwini;

import java.util.Scanner;

public class Numbers {
	public static Scanner scanner = new Scanner(System.in);
	public static int n;
	public static NumberDivisionRules number = new NumberDivisionRules();

	public static void main(String[] args) {
		readInput();
		number.getNumbersDivisableBy(3, n);
		number.getNumbersDivisableBy(5, n);
		number.getNumbersDivisableBy(3, 5, n);
		System.out.println("\n");
	}

	public static void readInput() {
		System.out.print("Enter number of children: " + "\n");
		n = scanner.nextInt();
	}
}
