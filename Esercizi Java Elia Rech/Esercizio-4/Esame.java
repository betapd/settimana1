package com.elia.array;

public class Esame {
	private int matricola;
	private String exam;
	private int voto;
	
	
	public Esame(int matricola, String exam, int voto) {
		this.matricola = matricola;
		this.exam = exam;
		this.voto = voto;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getExam() {
		return exam;
	}

	public void setExam(String exam) {
		this.exam = exam;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	@Override
	public String toString() {
		return "Esame [matricola=" + matricola + ", exam=" + exam + ", voto=" + voto + "]";
	}
	
}
