package practice_examples;

import java.util.*;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n = s.nextInt();
		if (isPrime(n)) {
			System.out.print(n + " is a prime number");
		} else {
			System.out.print(n + " is not a prime number");
		}
		s.close();
	}
	
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
