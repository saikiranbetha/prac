package practice_examples;

public class SwapTwoNumbers {
	
	static void SwapTheVariables(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
		System.out.println("Value of m = " + m);
		System.out.println("Value of n = " + n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10, n = 15;
		
		SwapTheVariables(m,n);

	}

}
