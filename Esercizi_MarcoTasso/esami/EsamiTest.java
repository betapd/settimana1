package com.marco.esami;

public class EsamiTest {
	public static void main(String[] args) {
		Studente[] studenti = new Studente[3];
		Esame[] esami = new Esame[7];
		
		studenti[0] = new Studente(1, "Marco", "Rossi");
		studenti[1] = new Studente(2, "Mario", "Verdi");
		studenti[2] = new Studente(3, "Giovanni", "Bianchi");
		
		// Doppio ciclo che compara gli studenti inseriti per verificare la corretta matricola
		for(Studente s : studenti)
			for (Studente s2 : studenti)
				if (s != s2 && s.getMatricola() == s2.getMatricola()) {
					System.out.println("Errore. Due studenti hanno la stessa matricola.");
					return;
				}
		
		esami[0] = new Esame(1, "Analisi", 30);
		esami[1] = new Esame(2, "Analisi", 18);
		esami[2] = new Esame(3, "Analisi", 27);
		esami[3] = new Esame(1, "Fisica", 29);
		esami[4] = new Esame(2, "Fisica", 19);
		esami[5] = new Esame(3, "Fisica", 25);
		esami[6] = new Esame(1, "Reti", 28);
		
		for (Studente s : studenti) {
			for (Esame e : esami) {
				if (s.getMatricola() == e.getMatricola()) {
					System.out.println(s.toString() + ", voto: " + e.getVoto() + "]");
				}
			}
		}
	}
}
