package com.marco.esercizi.vagoni;

public class Vagone {
	private int postiLiberiPrimaClasse = 20;
	private int postiLiberiSecondaClasse = 30;
	
	public int getPostiLiberiPrimaClasse() {
		return postiLiberiPrimaClasse;
	}
	
	public void setPostiLiberiPrimaClasse(int postiLiberiPrimaClasse) {
		this.postiLiberiPrimaClasse = postiLiberiPrimaClasse;
	}
	
	public int getPostiLiberiSecondaClasse() {
		return postiLiberiSecondaClasse;
	}
	
	public void setPostiLiberiSecondaClasse(int postiLiberiSecondaClasse) {
		this.postiLiberiSecondaClasse = postiLiberiSecondaClasse;
	}

	@Override
	public String toString() {
		return "Vagone [postiLiberiPrimaClasse=" + postiLiberiPrimaClasse + ", postiLiberiSecondaClasse="
				+ postiLiberiSecondaClasse + "]";
	}
}
