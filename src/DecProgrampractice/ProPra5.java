package DecProgrampractice;

import java.util.Scanner;

//Floyd's triangle

public class ProPra5 {

	public static void main(String[] args) {

		int n, num = 1, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
