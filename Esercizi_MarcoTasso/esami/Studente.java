package com.marco.esami;

/* Nel primo array (dimensione 3) vengono memorizzati: Matricola, Nome, Cognome.
 * Non devono esistere due studenti con la stessa matricola.
 * Nel secondo array (dimensione 7) vengono memorizzati: <matricola, esame, voto>.
 * Più record matricola possono essere associati a diversi esami.
 * Dopo aver inserito i dati tramite linea di comando nelle due strutture creare una voce di riepilogo per visualizzare gli studenti e i 
 * rispettivi esami.
 */

public class Studente {
	private int matricola;
	private String nome;
	private String cognome;
	
	public Studente(int matricola, String nome, String cognome) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome;
	}
}
