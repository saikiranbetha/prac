package ProgramsOnNumbers;

import java.util.Scanner;

public class PON6PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i;
		for(i=2; i<n; i++) {
			if(n%i == 0) {
				System.out.println("Not Prime");
				break;
			}
		}
		if(n==i) {
			System.out.println("Prime");
		}

	}

}
