package com.max.mcd;

import java.util.Scanner;

public class MassimoComuneDivisore {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Inserisci il primo numero");

		int a = in.nextInt();

		System.out.println("Inserisci il secondo numero");

		int b = in.nextInt();

		// valuto l'elemento più grande

		int x = a;

		int y = b;

		if (a > b) {
			x = b;
			y = a;
		}

		// Calcolo MCD

		int mcd;
		while ((mcd = x % y) != 0) {

			x = y;
			y = mcd;
		}
		;

		System.out.println("MCD: " + y);

	}
}
