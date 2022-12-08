package ProgramsOnNumbers;

import java.util.Scanner;

public class PON3SumOf1ToNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of n");
		int n = sc.nextInt();
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
