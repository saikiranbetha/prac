package StringMethods;

public class Split {

	public static void main(String[] args) {
		String text = "Java is a programming lanuguage";
		
		String[] result = text.split(" ");
		
		for (String str : result) {
			System.out.print(str + ", ");
		}
		
		String numbers = "1 2 3 4 5";
		
		String[] result1 = numbers.split(" ");
		
		for (String num : result1) {
			System.out.print(num);
		}
	}

}
