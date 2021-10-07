package com.marco.esercizi;

// Scrivere un programma che calcola il massimo comune denominatore di due numeri positivi immessi attraverso Scanner.

import java.util.Scanner;

public class McdScanner {
	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		int numero;
		boolean ok = true;
		Scanner scanner = new Scanner(System.in);
	
		// Attendo in ingresso il primo numero non negativo
		while (ok) {
			System.out.print("Inserire il primo numero: ");
			numero1 = scanner.nextInt();
			if (numero1 > 0) {
				ok = false;
			}
			else {
				System.out.println("Numero inserito non positivo!");
			}
		}
		
		// Attendo in ingresso il secondo numero non negativo
		ok = true;
		while (ok) {
			System.out.print("Inserire il secondo numero: ");
			numero2 = scanner.nextInt();
			if (numero2 > 0) {
				ok = false;
			}
			else {
				System.out.println("Numero inserito non positivo!");
				ok = true;
			}
		}
		
		scanner.close();
		
		// Prendo il numero minore
		if (numero1 <= numero2)
			numero = numero1;
		else
			numero = numero2;
		
		// Se uno dei due è 0 considero come numero di partenza l'altro
		if (numero1 == 0 | numero2 == 0) {
			if (numero1 == 0)
				numero = numero2;
			else if (numero2 == 0)
				numero = numero1;
		}
		
		// Ciclo che cerca il primo numero che è divisore di entrambi i numeri
		for (int i = numero; i > 0; i--) {
			if (numero1%i == 0 && numero2%i == 0) {
				System.out.println("L'MCD tra " + numero1 + " e " + numero2 + ": " + i);
				break;
			}
		}
	}
}
