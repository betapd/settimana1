package com.es.esami;

public class Esame {
	
	private int matricola;
	private String tipoEsame;
	private int voto;
	
	public Esame(int matricola, String tipoEsame, int voto) {
		
		this.matricola = matricola;
		this.tipoEsame = tipoEsame;
		this.voto = voto;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getTipoEsame() {
		return tipoEsame;
	}

	public void setTipoEsame(String tipoEsame) {
		this.tipoEsame = tipoEsame;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	@Override
	public String toString() {
		return "Esame [matricola=" + matricola + ", tipoEsame=" + tipoEsame + ", voto=" + voto + "]";
	}
	
	
	
}
