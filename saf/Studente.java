package com.max.tipidati;

import java.util.Scanner;

public class Studente {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		String[] Nome = new String[2];

		String[] Matricola = new String[2];
		String[] Cognome = new String[2];

		for (int i = 0; i < Matricola.length; i++) {
			System.out.println("Insert matricola:");
			String m = in.next();

			Matricola[i] = m;
			System.out.println("Matricola: " + Matricola[i]);

		}
		for (int j = 0; j < Nome.length; j++) {
			System.out.println("Insert nome:");
			String n = in.next();
			Nome[j] = n;
			System.out.println("Nome: " + Nome[j]);
		}

		for (int z = 0; z < Cognome.length; z++) {
			System.out.println("Insert cognome:");
			String c = in.next();
			Cognome[z] = c;
			System.out.println("Cognome: " + Cognome[z]);
		}

		System.out.println("Studente:");
		for (int z = 0; z < Cognome.length; z++) {

			System.out.println("Studente : " + Matricola[z] + " " + Nome[z] + " " + Cognome[z]);
		}
		System.out.println();

	}

}
