//Scrivere un programma che calcola il MCD di due numeri positivi immessi attraverso Scanner.

package com.fede.esercizio2;

import java.util.Arrays;
import java.util.Scanner;

public class CalcoloMCD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //cattura/legge i valori che l'utente inserisce
		//ArrayList<Integer> divisoriPrimoNumero = new ArrayList<Integer>();
		//ArrayList<Integer> divisoriSecondoNumero = new ArrayList<Integer>();
		
		int divisoriPrimoNumero[] = new int[25];
		int divisoriSecondoNumero[] = new int[25];
		int mcd = 0;
		
		System.out.println("Inserire il primo numero: ");
		int primo = in.nextInt();
		
		System.out.println("Inserire il secondo numero: ");
		int secondo = in.nextInt();
		
		int n = 0;
		
		for (int i = 1; i <= primo; i++) {
			int r = 0;
			
			r = primo % i;
			//System.out.println("Primo numero -> i: " + i + ", resto: " + r);
			if (r == 0) {
				n++;
				divisoriPrimoNumero[n] = i;
				
				//System.out.println(divisoriPrimoNumero[n]);
			}
		}
		System.out.println(Arrays.toString(divisoriPrimoNumero));
		
		int m = 0;
		
		for (int j = 1; j <= secondo; j++) {
			int r = 0;
			r = secondo % j;
			//System.out.println("Secondo numero -> j: " + j + ", resto: " + r);
			if (r == 0) {
				m++;
				divisoriSecondoNumero[m] = j;
				//System.out.println(divisoriSecondoNumero[m]);
			}
		}
		System.out.println(Arrays.toString(divisoriSecondoNumero));
		
		//problema parte qui
		for (int i = 0; i < divisoriPrimoNumero.length; i++) {
			for (int j = 0; j < divisoriSecondoNumero.length; j++) {
				if (divisoriPrimoNumero[i] == divisoriSecondoNumero[j]) {
					if (mcd <= divisoriPrimoNumero[i]) {
						//System.out.println("Entrato");
						mcd = divisoriPrimoNumero[i];
						System.out.println("mcd = " + mcd);
						//System.out.println("array posizione i: " + divisoriPrimoNumero[i]);
					}
				}
			}
		}
		if (mcd == 0) {
			System.out.println("MCD di "+ primo + " e " + secondo + " è 1");
		} else System.out.println("MCD di "+ primo + " e " + secondo + " = " + mcd);
		
		in.close();
	}

}
