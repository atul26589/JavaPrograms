package prep;

import java.util.Scanner;

public class Rotatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int nod = 0;
		int temp = n;
		while (temp > 0) {
			temp = temp / 10;
			nod++;
		}
		k = k % nod;
		if (k < 0) {
			k = k + nod;
		}

		int div = 1;
		int mul = 1;
		for (int i = 1; i <= nod; i++) {
			if (i <= k) {
				div = div * 10;
			} else {
				mul = mul * 10;
			}
		}

		int q = n / div;
		int r = n % div;
		int rot = (r * mul) + q;
		System.out.println(rot);
	}

}
