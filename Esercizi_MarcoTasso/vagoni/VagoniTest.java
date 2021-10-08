package com.marco.esercizi.vagoni;

import java.util.Scanner;

public class VagoniTest {
	public static void main(String[] args) {
		Vagone[] treno = new Vagone[3];
		for(int i = 0; i < treno.length; i++)
			treno[i] = new Vagone();
		
		int scelta = 0;
		boolean sceltaNonAccettabile = true;
		boolean trenoPieno = true;
		int postiLiberi = 0;
		int posto = 0;
		int numeroVagone = 0;
		int postiPrimaClasse = treno[0].getPostiLiberiPrimaClasse();
		int postiSecondaClasse = treno[0].getPostiLiberiSecondaClasse();
		Scanner scanner = new Scanner(System.in);
		Prenotazione p = new Prenotazione();
		
		while (trenoPieno) {
			sceltaNonAccettabile = true;
			System.out.println("Inserire nome e cognome: ");
			String nome = scanner.next();
			String cognome = scanner.next();
			Cliente c = new Cliente(nome, cognome);

			System.out.println("Scegliere se prima classe (1) o seconda classe (2): ");
			while (sceltaNonAccettabile) {
				scelta = scanner.nextInt();
				if (scelta == 1 || scelta == 2) {
					sceltaNonAccettabile = !sceltaNonAccettabile;
					break;
				}
				System.out.println("Classe scelta non accettabile!");
			}

			if (scelta == 1) { // Se e' stata selezionata la prima classe
				for (int i = 0; i < treno.length; i++) {
					postiLiberi = treno[i].getPostiLiberiPrimaClasse();
					if (postiLiberi != 0) {
						posto = postiPrimaClasse - postiLiberi + 1;
						numeroVagone = i + 1;
						System.out.println("Prenotato il posto numero " + posto + " nel vagone numero " + numeroVagone);
						treno[i].setPostiLiberiPrimaClasse(postiLiberi - 1);
						p = new Prenotazione(c, posto, scelta, i);
						break;
					}

					if (postiLiberi == 0 && i == 2) {
						System.out.println("Ci dispiace ma tutti i posti in prima classe sono esauriti.");
						System.out.println("Vuole prenotare un posto in seconda classe? S/N");
						sceltaNonAccettabile = true;
						while (sceltaNonAccettabile) {
							String risposta = scanner.nextLine();
							if (risposta.equals("S")) {
								scelta = 2;
								sceltaNonAccettabile = false;
							} else if (risposta.equals("N")) {
								System.out.println("Ci dispiace. Alla prossima.");
								sceltaNonAccettabile = false;
							}
						}
					}
				}
			}

			if (scelta == 2) { // Se e' stata selezionata la seconda classe
				for (int i = 0; i < treno.length; i++) {
					postiLiberi = treno[i].getPostiLiberiSecondaClasse();
					if (postiLiberi != 0) {
						posto = postiSecondaClasse - postiLiberi + 1;
						numeroVagone = i + 1;
						System.out.println("Prenotato il posto numero " + posto + " nel vagone numero " + numeroVagone);
						treno[i].setPostiLiberiSecondaClasse(postiLiberi - 1);
						p = new Prenotazione(c, posto, scelta, i);
						break;
					}

					if (postiLiberi == 0 && i == 2) { // Se tutti i posti in seconda classe in tutti i vagoni sono pieni
						System.out.println("Ci dispiace ma tutti i vagoni sono pieni.");
						trenoPieno = false;
						scanner.close();
						return;
					}
				}
			}

			System.out.println(p.toString());
			System.out.println();
		}
		
		scanner.close();
	}
}
