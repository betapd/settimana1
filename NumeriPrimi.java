package com.max.tipidati;

public class NumeriPrimi {

	public static boolean checkPrimo(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i <= n / 2; i++) {
			if ((n % i) == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		int n = 100; // numeri primi da 0 a 100

		for (int i = 1; i <= n; i++) {
			// System.out.println("\n index i:"+i);
			if (checkPrimo(i)) {

				int j = 0;
				int[] numPrimi = new int[j + 1];

				numPrimi[j] = i;

				System.out.println("\n index J:" + numPrimi[j]);
				j++;

			}
		}

	}
}
