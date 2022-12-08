package assignment7;

public class Main {

	public static void main(String args[]) {
		int[] arr = {10,20};
		swap(arr);
	}

	public static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
} 
