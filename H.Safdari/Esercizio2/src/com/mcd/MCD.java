package com.mcd;

import java.util.Scanner;

public class MCD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // per i dati in input
		System.out.println("Inserire n1:");
		int n1 = in.nextInt();

		System.out.println("Inserire n2:");
		int n2 = in.nextInt();
		
		if(n1<=0) {
			System.out.println("n1 deve essere maggiore di " + n1);
		}else if(n2<=0){
			System.out.println("n2 deve essere maggiore di " + n2);
		}

		int temp;

		int i = n1;
		int j = n2;
		if (n1 > n2)
			i = n2;
		    j = n1;

		while ((temp = i % j) != 0) {
			i = j;
			j = temp;
		}

		// for (int j = 0; j <n; j++)

		System.out.println("MCD è: " + j);

	}

}

