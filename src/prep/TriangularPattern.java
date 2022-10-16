package prep;

import java.util.Scanner;

public class TriangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of lines to be printed");
		int n = s.nextInt();
		i = 1;
		while (i <= n) {

			j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
			
		}
		s.close();
	}

}
