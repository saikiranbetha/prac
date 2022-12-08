package assignment8;

import java.util.ArrayList;
import java.util.Scanner;

class movieName {

	void MN(int movie) {

		switch (movie) {
		case 1:
			System.out.println("Please select date to book for Top Gun Maverick");
			break;
		case 2:
			System.out.println("Please select date to book for Black Adam");
			break;
		case 3:
			System.out.println("Please select date to book for Halloween Ends");
			break;
		case 4:
			System.out.println("Please select date to book for God Father");
			break;
		}

	}

}

class Date {
	void D(int date) {
		switch (date) {
		case 16:
			System.out.println("Please select time");
			break;
		case 17:
			System.out.println("Please select time");
			break;
		case 18:
			System.out.println("Please select time");
			break;
		case 19:
			System.out.println("Please select time");
			break;
		case 20:
			System.out.println("Please select time");
			break;
		}
	}
}

class Time {
	void T(int time) {
		switch (time) {
		case 1:
			System.out.println("Movie ticket booked");
			break;
		case 2:
			System.out.println("Movie ticket booked");
			break;
		case 3:
			System.out.println("Movie ticket booked");
			break;
		case 4:
			System.out.println("Movie ticket booked");
			break;
		}
	}
}

public class MovieTicketSlotBooking {

	public static void main(String[] args) {
		movieName M = new movieName();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Movie \n" + "1. Top Gun Maverick \n" + "2. Black Adam \n" + "3. Halloween Ends \n" + "4. God Father\n");

		int movie = sc.nextInt();

		M.MN(movie);

		ArrayList<String> arr = new ArrayList<String>();

		arr.add(" ");
		arr.add("Top Gun Maverick");
		arr.add("Black Adam");
		arr.add("Halloween Ends");
		arr.add("God Father");
		
		String s = arr.get(movie);

		Date d = new Date();
		System.out.println("16\t" + "17\t" + "18\t" + "19\t" + "20\t");

		int date = sc.nextInt();
		d.D(date);

		int[] dat = { 16, 17, 18, 19, 20 };
		int sd = 0;
		if (date == 16) {
			sd = dat[0];
		} else if (date == 17) {
			sd = dat[1];
		} else if (date == 18) {
			sd = dat[2];
		} else if (date == 19) {
			sd = dat[3];
		} else if (date == 20) {
			sd = dat[4];
		}

		Time t = new Time();

		System.out.println(
				"1. Morning Show 11 am\n" + "2. Matinee Show 2 pm\n" + "3. First Show 6 pm\n" + "4. Second Show 10 pm");
		int time = sc.nextInt();

		t.T(time);

		ArrayList<String> tim = new ArrayList<String>();

		tim.add(" ");
		tim.add("Morning Show 11 am");
		tim.add("Matinee Show 2 pm");
		tim.add("First Show 6 pm");
		tim.add("Second Show 10 pm");

		String st = tim.get(time);
		sc.close();

		System.out.println("Your movie ticket booked for " + s + " on date " + sd + " and " + st);
	}

}
