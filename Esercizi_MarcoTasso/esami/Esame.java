package com.marco.esami;

public class Esame {
	private int matricola;
	private String materia;
	private int voto;
	
	public Esame(int matricola, String materia, int voto) {
		super();
		this.matricola = matricola;
		this.materia = materia;
		this.voto = voto;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}
}
