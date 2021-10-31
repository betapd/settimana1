package com.elia.vagoni;

import java.util.Scanner;

public class Biglietto {
	static Vagone[] vag = new Vagone[3];
	static int primotot = 60;
	static int secondotot = 90;
	
	public static void main(String[] args) {

		Scanner pren = new Scanner(System.in);
		Vagone v1 = new Vagone(20, 30, 1,"");
		Vagone v2 = new Vagone(20, 30, 2,"");
		Vagone v3 = new Vagone(20, 30, 3,"");
		
		vag[0] = v1;
		vag[1] = v2;
		vag[2] = v3;

		System.out.println("Indichi con un numero la classe che vuole prenotare: 1 o 2");
		int classe = pren.nextInt();
		System.out.println(classe);

		System.out.println("Quanti biglietti vuoi prenotare");
		{
			int biglietti = pren.nextInt();

			if (biglietti <= primotot && classe == 1) {
				Biglietti(biglietti, classe);
				primotot = primotot - biglietti;
			}
			if (biglietti <= secondotot && classe == 2) {
				Biglietti(biglietti, classe);
				secondotot = secondotot - biglietti;
			}
		}
		for (int i = 0; i < 3; i++)
			System.out.println("Prima classe: " + vag[i].getPrima() + "Seconda classe: " + vag[i].getSeconda()
					+ "Numero vagone" + i);
	}
	

	public static void Biglietti(int biglietti, int classe) {
		int j = 0;
		Scanner pren = new Scanner(System.in);
		for (int i = 0; i < biglietti; i++) {
			if (classe == 1 && vag[j].getPrima() == 0)
				j++;
			if (classe == 2 && vag[j].getSeconda() == 0)
				j++;

			if (vag[j].getPrima() > 0 && classe == 1) {			
				System.out.println("Inserire il nome del cliente");
				String nome = pren.next();
				System.out.println(nome);
				System.out.println("Inserire il cognome del cliente");
				String cognome = pren.next();
				System.out.println(cognome);
				System.out.println("Inserire l'età del cliente");
				String eta = pren.next();
				System.out.println(eta);
				Cliente c = new Cliente(nome, cognome, eta);
				Vagone v = new Vagone(vag[j].getPrima() - 1, vag[j].getSeconda(), j, "1" + i);
				vag[j].setPrima(vag[j].getPrima() - 1);
			}
			if (vag[j].getSeconda() > 0 && classe == 2) {
				System.out.println("Inserire il nome del cliente");
				String nome = pren.next();
				System.out.println(nome);
				System.out.println("Inserire il cognome del cliente");
				String cognome = pren.next();
				System.out.println(cognome);
				System.out.println("Inserire l'età del cliente");
				String eta = pren.next();
				System.out.println(eta);
				Cliente c = new Cliente(nome, cognome, eta);
				Vagone v = new Vagone(vag[j].getPrima(), vag[j].getSeconda() - 1, j, "2" + i);
				vag[j].setSeconda(vag[j].getSeconda() - 1);
			}

		}

	}

}
