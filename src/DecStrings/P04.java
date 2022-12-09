package DecStrings;

import java.util.Scanner;

public class P04 {
	
	static Boolean areRotations(String str1, String str2) {
		return (str1.length() == str2.length() && ((str1 + str2).contains(str2)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(areRotations(str1, str2)){
			System.out.println("Strings are rotations of each other");
		} else {
			System.out.println("Strings are not rotations of each other");
		}
		
		sc.close();

	}

}
