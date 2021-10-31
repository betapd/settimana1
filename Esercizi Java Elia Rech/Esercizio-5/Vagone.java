package com.elia.vagoni;

public class Vagone {
	
	private int prima;
	private int seconda;
	private int numerovagone;
	private String posto;
	
	public Vagone() {} ;
	public Vagone(int prima, int seconda, int numerovagone, String posto) {
		this.prima = prima;
		this.seconda = seconda;
		this.numerovagone = numerovagone;
		this.posto = posto;
	}
	
	public int getPrima() {
		return prima;
	}
	public void setPrima(int prima) {
		this.prima = prima;
	}
	public int getSeconda() {
		return seconda;
	}
	public void setSeconda(int seconda) {
		this.seconda = seconda;
	}
	public int getNumerovagone() {
		return numerovagone;
	}
	public void setNumerovagone(int numerovagone) {
		this.numerovagone = numerovagone;
	}
	public String getPosto() {
		return posto;
	}
	public void setPosto(String posto) {
		this.posto = posto;
	}
	
	
		

}
