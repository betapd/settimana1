package com.fede.esercizio5;

import java.util.Scanner;

public class AssegnamentoPosti {
	//tre classi
	//vagone
	//cliente
	//logica inserimento

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce
		int menu = 0;
		// int posti = 0;
		Vagone v1 = new Vagone();
		Vagone v2 = new Vagone();
		Vagone v3 = new Vagone();
		boolean vagone1p = true;
		boolean vagone2p = true;
		boolean vagone3p = true;
		boolean vagone1s = true;
		boolean vagone2s = true;
		boolean vagone3s = true;

		System.out.println("MENU \n1) Prima classe \n2) Seconda classe");
		System.out.println("Scegliere un opzione");
		menu = in.nextInt();
		switch (menu) {
		case 1: // prima classe
			PrimaClasse(vagone1p, vagone2p, vagone3p, v1, v2, v3);
			break;
		case 2: // seconda classe
			SecondaClasse( vagone1s, vagone2s, vagone3s, v1, v2, v3);
			break;

		default:
			SecondaClasse( vagone1s, vagone2s, vagone3s, v1, v2, v3);
			break;
		}

	}

	public static void PrimaClasse(boolean v1p, boolean v2p, boolean v3p, Vagone v1, Vagone v2, Vagone v3) {
		Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce
		if (v1p) {
			int postiv1p = v1.getPrimaClasse(); // prendo il numero di posti rimanenti del primo vagone
			if (postiv1p == 0) { // se il vagone 1 è pieno passo agli altri
				int postiv2p = v2.getPrimaClasse(); // prendo il numero di posti rimanenti del secondo vagone
				if (postiv2p == 0) {
					int postiv3p = v3.getPrimaClasse(); // prendo il numero di posti rimanenti del terzo vagone
					if (postiv3p == 0) {
						int menu = 0;
						System.out.println("Posti finiti \nVuoi passare in seconda classe? \n1)Si \n2)No");
						System.out.println("Scegliere un opzione");
						menu = in.nextInt();
					} else
						v3.setPrimaClasse(postiv3p - 1);
				} else
					v2.setPrimaClasse(postiv2p - 1);
			} else
				v1.setPrimaClasse(postiv1p - 1);
		} else if (v2p) {
			int postiv2p = v2.getPrimaClasse(); // prendo il numero di posti rimanenti del secondo vagone
			if (postiv2p == 0) {
				int postiv3p = v3.getPrimaClasse(); // prendo il numero di posti rimanenti del terzo vagone
				if (postiv3p == 0) {
					System.out.println("Posti finiti");
				} else
					v3.setPrimaClasse(postiv3p - 1);
			} else
				v2.setPrimaClasse(postiv2p - 1);
		} else if (v3p) {
			int postiv3p = v3.getPrimaClasse(); // prendo il numero di posti rimanenti del terzo vagone
			if (postiv3p == 0) {
				System.out.println("Posti finiti");
			} else
				v3.setPrimaClasse(postiv3p - 1);
		}
	}

	public static void SecondaClasse(boolean v1s, boolean v2s, boolean v3s, Vagone v1, Vagone v2, Vagone v3) {
		Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce
		if (v1s) {
			int postiv1p = v1.getSecondaClasse(); // prendo il numero di posti rimanenti del primo vagone
			if (postiv1p == 0) { // se il vagone 1 è pieno passo agli altri
				int postiv2p = v2.getSecondaClasse(); // prendo il numero di posti rimanenti del secondo vagone
				if (postiv2p == 0) {
					int postiv3p = v3.getSecondaClasse(); // prendo il numero di posti rimanenti del terzo vagone
					if (postiv3p == 0) {
						System.out.println("Posti finiti");
					} else
						v3.setSecondaClasse(postiv3p - 1);
				} else
					v2.setSecondaClasse(postiv2p - 1);
			} else
				v1.setSecondaClasse(postiv1p - 1);
		} else if (v2s) {
			int postiv2p = v2.getSecondaClasse(); // prendo il numero di posti rimanenti del secondo vagone
			if (postiv2p == 0) {
				int postiv3p = v3.getSecondaClasse(); // prendo il numero di posti rimanenti del terzo vagone
				if (postiv3p == 0) {
					System.out.println("Posti finiti");
				} else
					v3.setSecondaClasse(postiv3p - 1);
			} else
				v2.setSecondaClasse(postiv2p - 1);
		} else if (v3s) {
			int postiv3p = v3.getSecondaClasse(); // prendo il numero di posti rimanenti del terzo vagone
			if (postiv3p == 0) {
				System.out.println("Posti finiti");
			} else
				v3.setSecondaClasse(postiv3p - 1);
		}
	}
}
