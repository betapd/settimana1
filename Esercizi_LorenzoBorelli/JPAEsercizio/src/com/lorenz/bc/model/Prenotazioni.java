package com.lorenz.bc.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Prenotazioni {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PREN_SEQ")
	@SequenceGenerator(sequenceName = "id_pren_seq", allocationSize = 1, name = "PREN_SEQ")
	@Id
	private int id;
	private String marca;
	private String quant;

	@ManyToMany(targetEntity = Utente.class)
	private Set<?> prenotazSet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getQuant() {
		return quant;
	}

	public void setQuant(String quant) {
		this.quant = quant;
	}

	public Set<?> getPrenotazSet() {
		return prenotazSet;
	}

	public void setPrenotazSet(Set<?> prenotazSet) {
		this.prenotazSet = prenotazSet;
	}

}
