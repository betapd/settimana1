package com.marco.esercizi.vagoni;

public class Prenotazione {
	private Cliente cliente;
	private int posto;
	private int classe;
	private int vagone;
	
	public Prenotazione() {
		
	}
	
	public Prenotazione(Cliente cliente, int posto, int classe, int vagone) {
		this.cliente = cliente;
		this.posto = posto;
		this.classe = classe;
		this.vagone = vagone;
	}

	@Override
	public String toString() {
		return "Prenotazione [cliente=" + cliente + ", posto=" + posto + ", classe=" + classe + ", vagone=" + vagone
				+ "]";
	}

	
}
