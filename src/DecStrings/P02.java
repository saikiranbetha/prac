package DecStrings;

// Palindrome checking
// for loop concept and while loop concept
import java.util.Scanner;

public class P02 {

	static void isPalindrome(String str) {
		int j = 0;
		String reverse = "";
		for (j = str.length() - 1; j >= 0; j--) {
			reverse = reverse + str.charAt(j);
		}
		
		if (str.equals(reverse)) {
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
	
	

//	static boolean isPalindrome(String str) {
//		int i = 0, j = str.length() - 1;
//		
//		while(i < j) {
//			if(str.charAt(i) != str.charAt(j)) {
//				return false;
//			}
//			i++;
//			j--;
//		}
//		
//		return true;
//	}
//	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		isPalindrome(str);

//		if (isPalindrome(str)) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

	}

}
