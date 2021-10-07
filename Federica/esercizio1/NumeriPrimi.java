//Scrivere un programma che stampa i numeri primi minori di 100.

package com.fede.esercizio1;

import java.util.Arrays;

public class NumeriPrimi {

	public static void main(String[] args) {
		int numeriPrimi[] = new int[100];
		int n = 0;
		for (int i = 1; i <= 100; i++) {
			if (primo(i)) {
				numeriPrimi[n] = i;
				n++;
			}

		}
		System.out.println("I numeri primi da 1 a 100 sono: " + Arrays.toString(numeriPrimi));
	}

	public static boolean primo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		if (n < 2)
			return false;
		return true;
	}

}
