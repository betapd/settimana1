package com.es.treno;

import java.util.Scanner;

/*
5)Scrivere un programma di assegnamento posti. (capienza massima vagone: 50 posti, 20 prima classe 30 seconda classe. Totale vagoni 3.)
Visualizzare le seguenti opzioni di prenotazione: 1 - per la prima classe
2 - per la seconda classe
Dopo la prenotazione visualizzare una schematica piantina con il posto assegnato.
I vagoni vanno occupati progressivamente.
Quando la sezione prima classe (per tutti i vagoni) è terminata chiedere al passeggero se vuole passare in seconda e viceversa.
Se i posti sono tutti occupati visualizzare il rispettivo messaggio.
*/
public class TrenoTest {
	public static void main(String[] args) {

		Vagone[] treno = new Vagone[3];

		for (int i = 0; i < treno.length; i++)
			treno[i] = new Vagone();
		int vagone = 0;
		
		Scanner in = new Scanner(System.in);
		Scanner postiP = new Scanner(System.in);
		Scanner postiS = new Scanner(System.in);
		int nVagone = 0;
		
		/*
		 * Da sistemare
		for (int e = 0; e < treno.length; e++) {
			
			nVagone = nVagone +1;
			System.out.println("Iniziamo con il test, inserisci il numero di posti della prima classe del vagone: " + nVagone);
			int nPostiPrima = postiP.nextInt();
			treno[e].setPrima(nPostiPrima);
			
			System.out.println("Ora inserisci il numero di posti della seconda classe del vagone: " + nVagone);
			int nPostiSeconda = postiS.nextInt();
			treno[e].setSeconda(nPostiSeconda);
			System.out.println(nVagone + treno[e].getPrima() + "\n" + nVagone + treno[e].getSeconda());
		}
		*/
		// controllo disponibilità
		for (int i = 0; i < treno.length; i++) {
			vagone = vagone +1;
			
			
			System.out.println("Salve, preferisce viaggiare in prima oppure in seconda classe?");
			String classe = in.next();

			while (!classe.equals("prima") && !classe.equals("seconda")) {
				System.out.println("Prego inserire il valore corretto");
				classe = in.next();
			}
			
			
			if (treno[i].getPrima() == 0 && treno[i].getSeconda() == 0) {
				System.out.println("Mi dispiace tutti i posti sono già occupati");
				break;
			} else {
				
				if (treno[i].getPrima() < 0 && treno[i].getSeconda() < 0) {
					System.out.println("Mi dispiace ma abbiamo terminato i posti");
				}

				// controllo disponibilità prima
				if (classe.equals("prima") && treno[i].getPrima() != 0) {
					System.out.println("La prenotazione è stata effettuata con successo");
					System.out.println(
							"Si trova nel vagone " + vagone + " e il suo posto è il numero " + treno[i].getPrima());

					treno[i].setPrima(treno[i].getPrima() - 1);
					System.out.println("Totale posti disponibili in Prima:" + treno[i].getPrima() + "\n"
							+ "Totale posti disponibili in Seconda: " + treno[i].getSeconda());
					break;
				} else if (classe.equals("prima") && treno[i].getPrima() == 0) {
					System.out.println(
							"Purtroppo i posti in prima classe sono terminati, le può andare bene la seconda?(si o no)");
					Scanner in2 = new Scanner(System.in);
					String risposta = in2.next();
					if (risposta.equals("si")) {
						System.out.println("La prenotazione è stata effettuata con successo");
						System.out.println("Si trova nel vagone " + vagone + " e il suo posto è il numero "
								+ treno[i].getSeconda());
						treno[i].setSeconda(treno[i].getSeconda() - 1);
						System.out.println("Totale posti disponibili in Prima:" + treno[i].getPrima() + "\n"
								+ "Totale posti disponibili in Seconda: " + treno[i].getSeconda());
						break;
					} else {
						System.out.println("Le auguro una buona giornata");
						break;
					}

				}

				// controllo disponibilità seconda
				if (classe.equals("seconda") && treno[i].getSeconda() != 0) {
					System.out.println("La prenotazione è stata effettuata con successo");
					System.out.println(
							"Si trova nel vagone " + vagone + " e il suo posto è il numero " + treno[i].getSeconda());
					treno[i].setSeconda(treno[i].getSeconda() - 1);
					System.out.println("Totale posti disponibili in Prima:" + treno[i].getPrima() + "\n"
							+ "Totale posti disponibili in Seconda: " + treno[i].getSeconda());
					break;
				} else if (classe.equals("seconda") && treno[i].getPrima() == 0) {
					System.out.println(
							"Purtroppo i posti in seconda classe sono terminati, le può andare bene la prima(si o no)");
					Scanner in3 = new Scanner(System.in);
					String risposta2 = in3.next();
					if (risposta2.equals("si")) {
						System.out.println("La prenotazione è stata effettuata con successo");
						System.out.println("Si trova nel vagone " + vagone + " e il suo posto è il numero "
								+ treno[i].getSeconda());
						treno[i].setPrima(treno[i].getPrima() - 1);
						System.out.println("Totale posti disponibili in Prima:" + treno[i].getPrima() + "\n"
								+ "Totale posti disponibili in Seconda: " + treno[i].getSeconda());
						break;
					} else {
						System.out.println("Le auguro una buona giornata");
						break;
					}

				}
			}

		}
	}
}
