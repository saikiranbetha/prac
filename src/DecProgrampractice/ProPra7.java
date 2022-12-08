package DecProgrampractice;

import java.util.Scanner;

//Reverse a String

public class ProPra7 {

	public static void main(String[] args) {
		String ori, reverse = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		ori = sc.nextLine();
		
		int length = ori.length();
		
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + ori.charAt(i);
		}
		
		System.out.println(reverse);
		
		// Internal method for the reverse
		StringBuffer sb = new StringBuffer("Hi my Self");
		sb.reverse();
		System.out.println(sb);

	}

}
