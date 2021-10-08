package esercizi;

import java.util.Scanner;

/* Scrivere un programma di assegnamento posti. (capienza massima vagone: 50 posti, 20 prima classe 30 seconda classe. 
 * Totale vagoni 3.)
Visualizzare le seguenti opzioni di prenotazione: 
1 - per la prima classe
2 - per la seconda classe
Dopo la pronatozione visualizzare una schematica piantina con il posto assegnato.
I vagoni vanno occupati progressivamente.
Quando la sezione prima classe (per tutti i vagoni) è terminata chiedere al passeggero se vuole passare in seconda e viceversa.
Se i posti sono tutti occupati visualizzare il rispettivo messaggio.
 */

//funzionante per 2 booking
public class Booking {
	public static void main(String[] args) {

		Vagone vag[] = new Vagone[3];
		for (int i = 0; i < vag.length; i++) {
			vag[i] = new Vagone();
		}

		boolean booked = true;
		String[] pers = Booking();
		Persona p = new Persona(pers[0], pers[1]);

		while (booked) {

			for (int i = 0; i < vag.length; i++) {

				if (vag[i].postiPrima == 0 && vag[i].postiSeconda == 0 && booked) {
					System.out.println("I posti sono terminati");
					booked = false;
				} else if (vag[i].postiPrima > 0 && vag[i].postiSeconda == 0 && booked) {
					System.out.println(
							"I posti sono terminati in prima classe, se vuoi passare in seconda digita 1, altrimenti 0.");
					Scanner in4 = new Scanner(System.in);
					int choice2 = in4.nextInt();
					if (choice2 == 1 && booked) {
						vag[i].postiSeconda--;
						booked = false;
						System.out.println("I posti rimasti nel vag " + i + " dopo la prenotazione del cliente "
								+ p.nome + " " + p.cognome + " in prima classe sono: " + vag[i].postiPrima
								+ ", mentre i posti rimasti in seconda sono: " + vag[i].postiSeconda);

					} else if (choice2 == 00 && booked) {
						System.out.println("Al prossimo" + " viaggio grazie.");
						System.out.println("I posti rimasti nel vag " + i + " dopo la prenotazione del cliente "
								+ p.nome + " " + p.cognome + " in prima classe sono: " + vag[i].postiPrima
								+ ", mentre i posti rimasti in seconda sono: " + vag[i].postiSeconda);
						booked = false;

					}
				}

				else if (vag[i].postiPrima == 0 && vag[i].postiSeconda > 0 && booked) {
					System.out.println(
							"I posti sono terminati in seconda classe, se vuoi passare in prima digita 1, altrimenti 0.");
					Scanner in5 = new Scanner(System.in);
					int choice3 = in5.nextInt();
					if (choice3 == 1 && booked) {
						vag[i].postiPrima--;
						booked = false;
						System.out.println("I posti rimasti nel vag " + i + " dopo la prenotazione del cliente "
								+ p.nome + " " + p.cognome + " in prima classe sono: " + vag[i].postiPrima
								+ ", mentre i posti rimasti in seconda sono: " + vag[i].postiSeconda);

					} else if (choice3 == 00 && booked) {
						System.out.println("Al prossimo viaggio grazie.");
						booked = false;
						System.out.println("I posti rimasti nel vag " + i + " dopo la prenotazione del cliente "
								+ p.nome + " " + p.cognome + " in prima classe sono: " + vag[i].postiPrima
								+ ", mentre i posti rimasti in seconda sono: " + vag[i].postiSeconda);
					}
				}

				if (pers[2].equals("1") && booked) {
					vag[i].postiPrima--;
					booked = false;
					System.out.println("I posti rimasti nel vag " + i + " dopo la prenotazione del cliente " + p.nome
							+ " " + p.cognome + " in prima classe sono: " + vag[i].postiPrima
							+ ", mentre i posti rimasti in seconda sono: " + vag[i].postiSeconda);

					Scanner in5 = new Scanner(System.in);
					System.out.println("\n Vuoi prenotare un altro posto? Digita 1 se la risposta è si, altrimenti 0 ");
					int book2 = in5.nextInt();
					if (book2 == 0) {
						pers = Booking();
						p = new Persona(pers[0], pers[1]);
						booked = true;
						if (pers[2].equals("1") && booked) {
							vag[i].postiPrima--;
							booked = false;
							System.out.println("I posti rimasti nel vag " + i + " dopo la prenotazione del cliente "
									+ p.nome + " " + p.cognome + " in prima classe sono: " + vag[i].postiPrima
									+ ", mentre i posti rimasti in seconda sono: " + vag[i].postiSeconda);

						} else if (pers[2].equals("2") && booked) {
							vag[i].postiSeconda--;
							booked = false;
							System.out.println(
									"I posti rimasti nel vag " + i + " dopo la prenotazione del cliente " + p.nome + " "
											+ p.cognome + " sono " + " in prima classe sono: " + vag[i].postiPrima
											+ ", mentre i posti rimasti in seconda sono: " + vag[i].postiSeconda);
						}

					} else if (book2 == 1) {
						booked = false;
						System.out.println("Grazie per aver viaggiato con noi");
					}

				} else if (pers[2].equals("2") && booked) {
					vag[i].postiSeconda--;
					booked = false;
					System.out.println("I posti rimasti nel vag " + i + " dopo la prenotazione del cliente " + p.nome
							+ " " + p.cognome + " sono " + " in prima classe sono: " + vag[i].postiPrima
							+ ", mentre i posti rimasti in seconda sono: " + vag[i].postiSeconda);

					Scanner in6 = new Scanner(System.in);
					System.out.println("\n Vuoi prenotare un altro posto? Digita 1 se la risposta è si, altrimenti 0 ");
					int book2 = in6.nextInt();
					if (book2 == 1) {

						pers = Booking();
						p = new Persona(pers[0], pers[1]);
						booked = true;
						if (pers[2].equals("1") && booked) {
							vag[i].postiPrima--;
							booked = false;
							System.out.println("I posti rimasti nel vag " + i + " dopo la prenotazione del cliente "
									+ p.nome + " " + p.cognome + " in prima classe sono: " + vag[i].postiPrima
									+ ", mentre i posti rimasti in seconda sono: " + vag[i].postiSeconda);

						} else if (pers[2].equals("2") && booked) {
							vag[i].postiSeconda--;
							booked = false;
							System.out.println(
									"I posti rimasti nel vag " + i + " dopo la prenotazione del cliente " + p.nome + " "
											+ p.cognome + " sono " + " in prima classe sono: " + vag[i].postiPrima
											+ ", mentre i posti rimasti in seconda sono: " + vag[i].postiSeconda);
						}

					} else if (book2 == 0) {
						booked = false;
						System.out.println("Grazie per aver viaggiato con noi");
					}

				}

			}
		}

	}

	private static class Vagone {
		int postiPrima;
		int postiSeconda;

		public Vagone() {
			postiPrima = 20;
			postiSeconda = 30;
		}
	}

	private static class Persona {
		String nome;
		String cognome;

		public Persona(String nome, String cognome) {

			this.nome = nome;
			this.cognome = cognome;
		}

	}

	private static String[] Booking() {

		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);

		System.out.println("Inserire il nome: ");
		String nome = in1.nextLine();
		System.out.println("Inserire il cognome: ");
		String cognome = in2.nextLine();
		System.out.println("Inserire 1 per prima classe, 2 per seconda classe: ");
		String choice = in3.nextLine();

		String[] cliente = { nome, cognome, choice };

		return cliente;
	}

}
