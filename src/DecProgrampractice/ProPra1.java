package DecProgrampractice;

public class ProPra1 {
	static int i = 1;
	static int n = 0;
	
	public static void main(String[] args) {
		if (i <= n) {
			System.out.printf("%d ", i++);
			main(null);
		}
	}
}
