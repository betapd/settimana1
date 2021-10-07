package com.marco.esercizi;

// Scrivere un programma che stampa i numeri primi minori di 100.

public class NumeriPrimi {
	public static void main(String[] args) {
		int num = 100;
		int totDivisori;
		
		for (int i = 0; i < num; i++) {
			totDivisori = 0;
			
			// Ciclo che conta se il numero i quanti divisori ha superiori a 1
			for (int j = 1; j < i; j++) {
				if (i%j == 0)
					totDivisori++;
			}
			
			// Se i ha solo un divisore (se stesso) allora è un numero primo e lo stampo
			if (totDivisori == 1)
				System.out.println(i);
		}
	}
}
