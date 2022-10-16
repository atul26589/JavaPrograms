package prep;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of n");
		int n = sc.nextInt();
		if (n == 0)
			System.out.println(1 + " ");
		else if (n == 1)
			System.out.println(1 + " ");
		else {

			System.out.print(1 + " ");
			System.out.print(1 + " ");
			a = 1;
			b = 1;
			c = 0;
			for (int i = 2; i <= n; i++) {
				c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;

			}
		}
		sc.close();
	}

}
