package practice_examples;

public class EvenOdd {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countEven = 0;
		int countOdd = 0;
		
		for (int i=1; i<=11; i++) {
			if (i % 2 == 0) {
				countEven += 1;
			} else {
				countOdd += 1;
			}
		}
		
		System.out.println("Even = " + countEven);
		System.out.println("Odd = " + countOdd);

	}

}
