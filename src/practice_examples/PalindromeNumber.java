package practice_examples;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, sum = 0, temp;
		int n = 54645;
		
		temp = n;
		
		while (n > 0) {
			r = n%10;
			sum = (sum * 10) + r;
			n = n/10;
		}
		if(temp == sum) {
			System.out.println("palindrome number");
		} else {
			System.out.println("Not a palindrome number");
		}

	}

}
