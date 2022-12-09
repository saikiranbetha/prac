package DecStrings;

import java.util.Scanner;

// Find Duplicates in a String
public class P03 {

	static final int NO_OF_CHARS = 256;

	/*
	 * Fills count arrays.array with frequency of characters
	 */

	static void fillCharCounts(String str, int[] count) {
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
	}

	static void printDuplicates(String str) {

		// Create an arrays.array of size
		// 256 and fill count of
		// every character in it
		int[] count = new int[NO_OF_CHARS];
		fillCharCounts(str, count);

		for (int i = 0; i < NO_OF_CHARS; i++) {
			if (count[i] > 1) {
				System.out.println((char) (i) + ", count = " + count[i]);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printDuplicates(str);

	}

}
