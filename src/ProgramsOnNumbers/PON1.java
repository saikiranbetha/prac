package ProgramsOnNumbers;

import java.util.Scanner;

// print 1 to N numbers
public class PON1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}
}
