//Scrivere un programma di assegnamento posti
//capienza massima vagone -> 50 posti, 20 prima classe 30 seconda classe. Totale vagoni 3
//Visualizzare le seguenti opzioni di prenotazione: 
//1 - per la prima classe
//2 - per la seconda classe
//Dopo la pronatozione visualizzare una schematica piantina con il posto assegnato
//I vagoni vanno occupati progressivamente
//Quando la sezione prima classe,per tutti i vagoni, e terminata chiedere al passeggero 
//se vuole passare in seconda e viceversa.
//Se i posti sono tutti occupati visualizzare il rispettivo messaggio

package com.fede.esercizio5;

import java.util.Scanner;

public class AssegnamentoPosti {

	static Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce
	static Vagone vagoni[] = new Vagone[3];
	static int totPrimaClasse = 60;
	static int totSecondaClasse = 90;
	static int totPosti = 150;
	static int[][] piantina = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 },
			{ 17, 18, 19, 20 }, { 21, 22, 23, 24 }, { 25, 26, 27, 28 }, { 29, 30, 31, 32 }, { 33, 34, 35, 36 },
			{ 37, 38, 39, 40 }, { 41, 42, 43, 44 }, { 45, 46, 47, 48 }, { 0, 49, 50, 0 } };

	public static void main(String[] args) {

		Vagone v1 = new Vagone("Vagone A", 20, 30);
		Vagone v2 = new Vagone("Vagone B", 20, 30);
		Vagone v3 = new Vagone("Vagone C", 20, 30);

		vagoni[0] = v1;
		vagoni[1] = v2;
		vagoni[2] = v3;

		while (totPosti != 0) { // ciclo finchè non sono finiti i posti di tutti i vagoni
			// Richiesta dei dati
			System.out.println("MENU \n1) Prima classe \n2) Seconda classe");
			System.out.println("Scegliere un opzione");
			int menu = in.nextInt();
			System.out.println("Inserire il nome e cognome del titolare del biglietto:");
			String nome = in.next();
			String cognome = in.next();			
			System.out.println("Inserire il numero di telefono del titolare del biglietto:");
			long cellulare = in.nextInt();
			Cliente c = new Cliente(nome, cognome, cellulare); // creazione del cliente con i dati immessi
			// menu sottoposto al cliente
			switch (menu) {
			case 1: // prima classe
				PrimaClasse(c);
				break;
			case 2: // seconda classe
				SecondaClasse(c);
				break;

			default: // seconda classe
				SecondaClasse(c);
				break;
			}
		}
		System.out.println("Posti su questo treno terminati. \n Ci scusiamo per il disagio");
	}

	// --------------PRIMA CLASSE--------------
	public static void PrimaClasse(Cliente c) {

		if (totPrimaClasse > 0) { // controllo se i posti totali in prima classe non sono finiti
			if (vagoni[0].getPrimaClasse() > 0) { // controllo se nel primo vagone ci sono posti liberi in prima classe
				Biglietto(c, vagoni, 0, 1);
				vagoni[0].setPrimaClasse(vagoni[0].getPrimaClasse() - 1);
				totPrimaClasse--;
				totPosti--;
			} else if (vagoni[1].getPrimaClasse() > 0) { // controllo se nel secondo vagone ci sono posti liberi in
															// prima classe
				Biglietto(c, vagoni, 1, 1);
				vagoni[1].setPrimaClasse(vagoni[1].getPrimaClasse() - 1);
				totPrimaClasse--;
				totPosti--;
			} else if (vagoni[2].getPrimaClasse() > 0) { // controllo se nel terzo vagone ci sono posti liberi in prima
															// classe
				Biglietto(c, vagoni, 2, 1);
				vagoni[2].setPrimaClasse(vagoni[2].getPrimaClasse() - 1);
				totPrimaClasse--;
				totPosti--;
			}
			// stampa la piantina del vagone mettendo una X per indicare il posto prenotato
			System.out.println("-----PIANTINA VAGONE-----\n");
			for (int i = 0; i < piantina.length; i++) {
				for (int j = 0; j < piantina[0].length; j++) {
					if (piantina[i][j] == vagoni[1].getPrimaClasse() + 1) {
						System.out.print("X\t");
					} else
						System.out.print("O\t");
				}
				System.out.println();
			}
			System.out.println("-----PIANTINA VAGONE-----\n");

		} else {
			if (totSecondaClasse > 0) {
				System.out.println("Posti in prima classe terminati.\nVuoi passare in seconda classe? \n1)Si \n2)No");
				System.out.println("Scegliere un opzione");
				int menu = in.nextInt();
				switch (menu) {
				case 1: // SI
					SecondaClasse(c);
					break;
				case 2: // NO
					System.out.println("Ci scusiamo per il disagio.");
					break;
				}
			} else
				System.out.println("Ci scusiamo per il disagio.");
		}
	}

	// --------------SECONDA CLASSE--------------
	public static void SecondaClasse(Cliente c) {

		if (totSecondaClasse > 0) {
			if (vagoni[0].getSecondaClasse() > 0) { // controllo se nel primo vagone ci sono posti liberi in seconda
													// classe
				Biglietto(c, vagoni, 2, 2);
				vagoni[0].setSecondaClasse(vagoni[0].getSecondaClasse() - 1);
				totPrimaClasse--;
				totPosti--;
			} else if (vagoni[1].getSecondaClasse() > 0) { // controllo se nel secondo vagone ci sono posti liberi in
															// seconda classe
				Biglietto(c, vagoni, 2, 2);
				vagoni[1].setSecondaClasse(vagoni[1].getSecondaClasse() - 1);
				totPrimaClasse--;
				totPosti--;
			} else if (vagoni[2].getSecondaClasse() > 0) { // controllo se nel terzo vagone ci sono posti liberi in
															// seconda classe
				Biglietto(c, vagoni, 2, 2);
				vagoni[2].setSecondaClasse(vagoni[2].getSecondaClasse() - 1);
				totPrimaClasse--;
				totPosti--;
			}
			// stampa la piantina del vagone mettendo una X per indicare il posto prenotato
			System.out.println("-----PIANTINA VAGONE-----\n");
			for (int i = 0; i < piantina.length; i++) {
				for (int j = 0; j < piantina[0].length; j++) {
					if (piantina[i][j] == vagoni[1].getSecondaClasse() + 1) {
						System.out.print("X\t");
					} else
						System.out.print("O\t");
				}
				System.out.println();
			}
			System.out.println("-----PIANTINA VAGONE-----\n");

		} else {

			if (totPrimaClasse > 0) {
				System.out.println(
						"Posti liberi in seconda classe terminati.\nVuoi passare in prima classe? \n1)Si \n2)No");
				System.out.println("Scegliere un opzione");
				int menu = in.nextInt();
				switch (menu) {
				case 1: // SI
					PrimaClasse(c);
					break;
				case 2: // NO
					System.out.println("Ci scusiamo per il disagio.");
					break;
				}
			} else
				System.out.println("Ci scusiamo per il disagio.");

		}
	}

	// --------------BIGLIETTO--------------
	public static void Biglietto(Cliente c, Vagone vagoni[], int n, int check) {
		switch (check) {
		case 1:
			System.out.println("-----BIGLIETTO-----\n" + "Titolare del biglietto: " + c.getNome() + " " + c.getCognome()
					+ "\nCellulare: " + c.getCellulare() + "\nPosto in PRIMA classe numero: "
					+ vagoni[n].getPrimaClasse() + " " + vagoni[n].getNome() + "\n-----FINE BIGLIETTO-----");
			break;
		case 2:
			System.out.println("-----BIGLIETTO-----\n" + "Titolare del biglietto: " + c.getNome() + " " + c.getCognome()
					+ "\nCellulare: " + c.getCellulare() + "\nPosto in SECONDA classe numero: "
					+ vagoni[n].getSecondaClasse() + " " + vagoni[n].getNome() + "\n-----FINE BIGLIETTO-----");
			break;
		default:
			break;
		}
	}
}
