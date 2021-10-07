package com.fede.esercizio4;

public class Riepilogo {
	private int matricola;
	private String nome;
	private String cognome;
	private String esame;
	private int voto;
	public Riepilogo(int matricola, String nome, String cognome, String esame, int voto) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.esame = esame;
		this.voto = voto;
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
	public String getEsame() {
		return esame;
	}
	public void setEsame(String esame) {
		this.esame = esame;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	@Override
	public String toString() {
		return "[nome=" + nome + ", cognome=" + cognome + ", esame=" + esame
				+ ", voto=" + voto + "]";
	}
	
	
}
