package com.fede.esercizio5;

public class Vagone {
	private String nome;
	private int primaClasse;
	private int secondaClasse;
	
	public Vagone(String nome, int primaClasse, int secondaClasse) {
		this.nome = nome;
		this.primaClasse = primaClasse;
		this.secondaClasse = secondaClasse;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrimaClasse() {
		return primaClasse;
	}

	public void setPrimaClasse(int primaClasse) {
		this.primaClasse = primaClasse;
	}

	public int getSecondaClasse() {
		return secondaClasse;
	}

	public void setSecondaClasse(int secondaClasse) {
		this.secondaClasse = secondaClasse;
	}
	
	
}
