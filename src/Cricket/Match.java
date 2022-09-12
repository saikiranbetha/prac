package Cricket;

import java.util.*;

public class Match {

	public static void main(String[] args) {
		
		
		String T1;
		String T2;
		
		int Overs;
		
		
		int N1;
		int N2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Team 1: ");
		
		T1 = sc.nextLine();
		
		System.out.println("Enter Team 2: ");
		
		T2 = sc.nextLine();
		
		int Ove = 50;
		System.out.println("No of overs is " + Ove);
		
		System.out.println("Please enter the Weather Condition \n" + "1. Weather is Clear \n" + "2. Raining since 1hrs \n" + "3. Raining since 2hrs \n" + "4. Raining since 3hrs \n" + "5. Raining since 4hrs \n" + "6. Raining since 5hrs");
		
		int rain = sc.nextInt();
		

		switch(rain){
			case 1 :
				Overs = Ove;
				System.out.println("No of overs = " + Overs);
				break;
			case 2 :
				Overs = Ove - 10;
				System.out.println("No of overs = " + Overs);
				break;
			case 3 :
				Overs = Ove - 20;
				System.out.println("No of overs = " + Overs);
				break;
			case 4 :
				Overs = Ove - 30;
				System.out.println("No of overs = " + Overs);
				break;
			case 5 :
				Overs = Ove - 40;
				System.out.println("No of overs = " + Overs);
				break;
			case 6 :
				System.out.println("Match Cancelled due to rain");
				break;
		}
		
		System.out.println("Enter 1st innings score: ");
			
		N1 = sc.nextInt();
		System.out.println("Enter 2st innings score: ");

		N2 = sc.nextInt();
		
		if (N1 > N2) {
			System.out.println(T1 + " Won the match");
		} else if (N2 > N1){
			System.out.println(T2 + " Won the match");
		} else {
			System.out.println("Match Tie");
		}
	} 

}
