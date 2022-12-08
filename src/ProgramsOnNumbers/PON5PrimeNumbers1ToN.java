package ProgramsOnNumbers;

import java.util.Scanner;

public class PON5PrimeNumbers1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number");
		int n = sc.nextInt();
		System.out.println("Prime numbers between 1 to " + n);
		for(int i=1; i<n; i++) {
			boolean isPrime = true;
			for (int j=2; j<i ; j++) {
				if (i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) 
				System.out.println(i + " ");
		}
	}

}
