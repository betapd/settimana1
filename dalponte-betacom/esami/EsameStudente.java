package com.es.esami;

public class EsameStudente {
	public static void main(String[] args) {

		Studente s1 = new Studente(1234, "Mario", "Rossi");
		Studente s2 = new Studente(1235, "Alessandro", "Verdi");
		Studente s3 = new Studente(1236, "Davide", "Neri");

		Studente[] studenti = new Studente[3];

		studenti[0] = s1;
		studenti[1] = s2;
		studenti[2] = s3;

		Esame e1 = new Esame(1234, "Economia Aziendale", 25);
		Esame e2 = new Esame(1235, "Diritto Privato", 27);
		Esame e3 = new Esame(1234, "Economia Politica", 18);
		Esame e4 = new Esame(1236, "Diritto Privato", 30);
		Esame e5 = new Esame(1234, "Ragioneria Internazionale", 29);
		Esame e6 = new Esame(1235, "Economia Aziendale", 22);
		Esame e7 = new Esame(1235, "Diritto Pubblico", 21);

		Esame[] esami = new Esame[7];

		esami[0] = e1;
		esami[1] = e2;
		esami[2] = e3;
		esami[3] = e4;
		esami[4] = e5;
		esami[5] = e6;
		esami[6] = e7;

		for (Studente i : studenti) {

			for (Esame e : esami) {

				if (i.getMatricola() == e.getMatricola()) {
					System.out.println(i.toString() + " tipo di esame=" + e.getTipoEsame() + ", voto=" + e.getVoto());

				}
			}

		}

	}

}
