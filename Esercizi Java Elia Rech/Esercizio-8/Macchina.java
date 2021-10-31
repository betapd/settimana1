package com.elia.parcheggi;

public class Macchina {
	private double Orarioentrata;
	private double Orariouscita;
	
	
	public Macchina(double Orarioentrata, double Orariouscita) {
		this.Orarioentrata = Orarioentrata;
		this.Orariouscita = Orariouscita;
	}
	public double getOrarioentrata() {
		return Orarioentrata;
	}
	public void setEntrata(int entrata) {
		this.Orarioentrata = entrata;
	}
	public double getUscita() {
		return Orariouscita;
	}
	public void setUscita(int uscita) {
		this.Orariouscita = uscita;
	}
	

}
