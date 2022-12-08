package DecProgrampractice;

import java.util.ArrayList;
import java.util.Scanner;

//substrings of a string and adding to the list

public class ProPra6 {
	public static void main(String[] args) {
		String string, sub;
		int i, c, length;
		ArrayList<String> a = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to print all the substrings");
		string = sc.nextLine();
		length = string.length();
		System.out.println("Substrings of \"" + string + "\" are :-");
		for (c = 0; c <= length; c++) {
			for (i = 1; i <= length - c; i++) {
				sub = string.substring(c, c + i);
				System.out.println(sub);
				a.add(sub);

			}
		}

		System.out.println(a);
	}
}
