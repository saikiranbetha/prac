package Patterns;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row = 7;
		for (i=0; i<row; i++) {
			for (j=2*(row-(i+1)); j>=1; j--) {
				System.out.print(" ");
			}
			for (j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
