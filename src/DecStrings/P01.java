package DecStrings;

import java.util.*;

// Reverse a String

public class P01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		StringBuffer sbr = new StringBuffer(input);
		sbr.reverse();
		System.out.println(sbr);
		sc.close();
	}

}
