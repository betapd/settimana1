//Dopo aver ricevuto in input l'anno e il mese, rappresentare un calendario con il giorno attuale evidenziato da un asterisco.
//Se il giorno attuale non si trova nel mese inserito, non verrà fuori l'asterisco

package com.fede.esercizio7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarioTest {

	static Scanner in = new Scanner(System.in); // cattura/legge i valori che l'utente inserisce
	static String nomeGiorni[] = { "LUN", "MAR", "MER", "GIO", "VEN", "SAB", "DOM" };
	static String nomeMesi[] = { "GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO",
			"SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE" };
	static int anno = 0;
	static int mese = 0;
	static int giorniTot = 0;
	static int giorno = 0;
	static int settimane = 0;

	public static void main(String[] args) {
		System.out.println("Inserire l'anno");
		anno = in.nextInt();
		System.out.println("Inserire il mese");
		mese = in.nextInt() - 1;
		GregorianCalendar calendar = new GregorianCalendar(anno, mese, 1); // calendario vuoto

		giorno = calendar.get(Calendar.DAY_OF_WEEK); // salvo il numero corrispondente al giorno 1 del calendario
		giorniTot = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // salvo i giorni totali presenti nel mese
																		// richiesto dall'utente
		settimane = giorniTot / 7; // calcolo le settimane per capire le rige da dover stampare per il calendario
		int extraGiorni = giorniTot % 7; // verifico se ci sono giorni che vanno oltre le settimane calcolate
		if (extraGiorni != 0) { // se ci sono giorni extra
			if (giorno != 2 | mese != 1) { // se il mese non è febbraio e il primo del mese non è lunedi
				settimane++; // aggiungo una settimana per aggiungere una riga al calendario
			}
		}
		
		StampaGiorni();
		
		switch (giorno) { // in base al giorno della settimana corrispondente al numero 1, setto le
							// tabulazioni per impostare il calendario
		case 2: // lunedi
			StampaCalendario();
			break;
		case 3: // martedi
			System.out.print("\t");
			StampaCalendario();
			break;
		case 4: // mercoledi
			System.out.print("\t" + "\t");
			StampaCalendario();
			break;
		case 5: // giovedi
			System.out.print("\t" + "\t" + "\t");
			StampaCalendario();
			break;
		case 6: // venerdi
			System.out.print("\t" + "\t" + "\t" + "\t");
			StampaCalendario();
			break;
		case 7: // sabato
			System.out.print("\t" + "\t" + "\t" + "\t" + "\t");
			StampaCalendario();
			break;
		case 1: // domeninca
			System.out.print("\t" + "\t" + "\t" + "\t" + "\t" + "\t");
			StampaCalendario();
			break;
		}
	}

	public static void StampaGiorni() {
		// stampa nome giorni della settimana
		System.out.println("----------------- " + nomeMesi[mese] + " " + anno + " -----------------");
		for (int i = 0; i < nomeGiorni.length; i++) {
			System.out.print(nomeGiorni[i] + "\t");
		}
		System.out.println();
	}

	public static void StampaCalendario() {
		// 2 -> lun
		// 3 -> mar
		// 4 -> mer
		// 5 -> gio
		// 6 -> ven
		// 7 -> sab
		// 1 -> dom
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH);
		int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		boolean check = false;
		if (year == anno & month == mese) { // controllo se la data corrente è presente nel mese richiesto dall'utente
			check = true;
		}

		int n = 1;
		for (int j = 1; j <= settimane; j++) { // una riga per ogni settimana
			if (j == 1) { // se è la prima settimana
				for (int z = giorno - 1; z < 8; z++) { // parto a stampare in base al giorno che corrisponde al numero 1
					if (n <= giorniTot) {
						if (check & n == day) { // se il giorno attuale è presente nel mese scelto dall'utente e il suo
												// numero corrisponde con il numero da stampare viene evidenziato con 2
												// asterischi
							System.out.print("*" + n + "*\t");
							n++;
						} else {
							System.out.print(n + "\t");
							n++;
						}
					}
				}
			} else {
				for (int k = 1; k < 8; k++) { // stampo sulla stessa riga 7 numeri
					if (n <= giorniTot) {
						if (check & n == day) { // se il giorno attuale è presente nel mese scelto dall'utente e il suo
												// numero corrisponde con il numero da stampare viene evidenziato con 2
												// asterischi
							System.out.print("*" + n + "*\t");
							n++;
						} else {
							System.out.print(n + "\t");
							n++;
						}
					}
				}
			}
			System.out.println();
		}
	}
}
