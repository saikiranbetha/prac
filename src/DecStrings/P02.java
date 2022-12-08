package DecStrings;


// Palindrome checking
import java.util.Scanner;

public class P02 {
	
	
	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if (isPalindrome(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
