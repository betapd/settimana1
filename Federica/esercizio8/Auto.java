package com.fede.esercizio8;

public class Auto {
	private String nomeProprietario;
	private String marca;
	private int oraEntrata;
	private int oraUscita;
	
	public Auto(String nomeProprietario, String marca, int oraEntrata, int oraUscita) {
		this.nomeProprietario = nomeProprietario;
		this.marca = marca;
		this.oraEntrata = oraEntrata;
		this.oraUscita = oraUscita;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getOraEntrata() {
		return oraEntrata;
	}

	public void setOraEntrata(int oraEntrata) {
		this.oraEntrata = oraEntrata;
	}

	public int getOraUscita() {
		return oraUscita;
	}

	public void setOraUscita(int oraUscita) {
		this.oraUscita = oraUscita;
	}

	@Override
	public String toString() {
		return "Auto ->" + nomeProprietario + " " + marca;
	}
	
	
}
