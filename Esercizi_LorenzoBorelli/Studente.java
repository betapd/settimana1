package esercizi;

public class Studente {
	public static void main(String[] args) {

		Persona[] s = new Persona[3];
		Esito[] e = new Esito[7];

		s[0] = new Persona("Marco", "Rossi", "11111");
		s[1] = new Persona("Marc", "ROssi", "11112");
		s[2] = new Persona("Frank", "ROssi", "11113");

		e[0] = new Esito("filosofia", "28", "11111");
		e[1] = new Esito("filosofia clinica", "28", "11111");
		e[2] = new Esito("elettronica", "28", "11112");
		e[3] = new Esito("filosofia", "28", "11112");
		e[4] = new Esito("filosofia clinica", "28", "11113");
		e[5] = new Esito("elettronica", "28", "11113");
		e[6] = new Esito("fisica 2", "28", "11113");

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < e.length; j++) {
				if ((s[i].matricola).equals(e[j].matricola)) {
					System.out.println("Lo studente " + s[i].nome + "  " + s[i].cognome + " nell'esame " + e[i].esame
							+ " ha preso: " + e[1].voto);

				}
			}
		}
	}

	private static class Persona {
		String nome;
		String cognome;
		String matricola;

		public Persona(String nome, String cognome, String matricola) {
			this.nome = nome;
			this.cognome = cognome;
			this.matricola = matricola;
		}

	}

	private static class Esito {

		String esame;
		String voto;
		String matricola;

		public Esito(String esame, String voto, String matricola) {
			this.esame = esame;
			this.voto = voto;
			this.matricola = matricola;
		}

	}

}