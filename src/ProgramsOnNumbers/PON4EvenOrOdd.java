package ProgramsOnNumbers;

import java.util.Scanner;

public class PON4EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}

	}

}
