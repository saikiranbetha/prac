package Probability;

import java.util.Scanner;

public class Probability {

	public double redWinning(double red, double blue, double green) {
		double result = red / (red + blue + green);
		return (double) result;
	}
	
	public double blueWinning(double red, double blue, double green) {
		double result = blue / (red + blue + green);
		return (double) result;
	}
	
	public double greenWinning(double red, double blue, double green) {
		double result = green / (red + blue + green);
		return (double) result;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Red : ");
		double red = sc.nextDouble();
		
		
		System.out.println("Enter number of Blue : ");
		double blue = sc.nextDouble();
		
		System.out.println("Enter number of Green : ");
		double green = sc.nextDouble();
		
		
		System.out.println("Please enter the probability you want \n" + "1. Winning probability of red \n" + "2. Winning probability of blue \n" + "3. Winning probability of green");
		int n = sc.nextInt();
		
		
		switch (n) {
			case 1:
				Probability ob1 = new Probability();
				double redWinning = ob1.redWinning(red, blue, green);
				System.out.println(redWinning);
				break;
			case 2:
				Probability ob2 = new Probability();
				double blueWinning = ob2.blueWinning(red, blue, green);
				System.out.println(blueWinning);
				break;
			case 3:
				Probability ob3 = new Probability();
				double greenWinning = ob3.greenWinning(red, blue, green);
				System.out.println(greenWinning);
				break;
		}
		

	}

}
