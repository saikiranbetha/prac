package practice_examples;

public class LargestNumInArray {
	
	static int arr[] = {10, 50, 200, 1000};
	
	static int largest() {
		int i;
		
		int max = arr[0];
		
		for (i=1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largest());

	}

}
