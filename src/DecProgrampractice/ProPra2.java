package DecProgrampractice;

import java.util.Scanner;

//Fahrenheit to celsius program
public class ProPra2 {

	public static void main(String[] args) {
		Float Temperature;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit : ");
		
		Temperature = sc.nextFloat();
		
		Temperature = ((Temperature - 32) * 5) / 9;
		
		System.out.println("Temperature in celsius: " + Temperature);
		

	}

}
