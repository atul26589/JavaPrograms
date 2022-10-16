package patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int st = n, sp = 0;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = n; j > sp; j--) {
				System.out.print("*");
			}
			
			sp++;
			st--;
			System.out.println();
		}

	}
}
