package DecProgrampractice;

public class ProPra9 {
	public static void FirstNonRepeat(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

	public static void main(String[] args) {
		String s = "geekforgeeks";
		FirstNonRepeat(s);
	}

}
