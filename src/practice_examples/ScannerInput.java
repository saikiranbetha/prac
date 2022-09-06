package practice_examples;

import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter an Integer: ");
		
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		s.close();
		System.out.println("Entered integer is - " + num);

	}

}
