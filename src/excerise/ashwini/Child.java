package excerise.ashwini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Child {
	public static Scanner scanner = new Scanner(System.in);
	public static int n = 0;
	public static int k = 0;
	public static Child winner;
	public int id;

	public static void exitProgram(String flag, Scanner scanner) {
		if ("No".equalsIgnoreCase(flag)) {
			System.out.println("Exit!");
			scanner.close();
			System.exit(0);
		} else {
			readInput();
		}

	}

	public static void readInput() {
		System.out.print("Enter number of children: " + "\n");
		n = scanner.nextInt();
		System.out.print("Enter the count: " + "\n");
		k = scanner.nextInt();
		boolean validflag = validateInput(n, k);
		if (!validflag) {
			System.out.print("Do you wish to continue:Yes/No?");
			String proceed = scanner.next();
			exitProgram(proceed, scanner);
		} else {
			winner = findtheWinner(n, k);
			System.out.println("Winner is:" + winner.id);
			System.out.print("Do you wish to continue:Yes/No?");
			String proceed = scanner.next();
			exitProgram(proceed, scanner);
		}
	}

	public static boolean validateInput(int n, int k) {
		if (n <= 1 || k <= 0) {
			System.out.print("Invalid input" + "\n");
			return false;
		}
		return true;
	}

	public static Child findtheWinner(int n, int k) {
		int rem = 0;
		ArrayList<Child> childern = new ArrayList<Child>();

		for (int a = 1; a <= n; a++) {
			Child child = new Child();
			child.id = a;
			childern.add(child);
		}
		while (n > 1) {
			System.out.print("The sequence of children retained:");
			for (Child a : childern) {
				System.out.print(+a.id + ",");
			}
			System.out.print("\n");
			if (k > n) {
				rem = k % n;
				if (rem == 0) {
					rem = n;
					childern.remove(rem - 1);

				} else {
					int length = n - (rem);
					childern.remove(rem - 1);
					Collections.rotate(childern, length);

				}
			} else {
				rem = k;
				int length = n - (rem);
				childern.remove(rem - 1);
				Collections.rotate(childern, length);
			}

			n--;
		}
		return childern.get(0);
	}

}
