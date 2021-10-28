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
public class Utente {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UTENTE_SEQ")
	@SequenceGenerator(sequenceName = "id_utente_seq", allocationSize = 1, name = "UTENTE_SEQ")
	@Id
	private int id;
	
	private String nome;
	private String cognome;
	private String username;
	
	@ManyToMany(targetEntity = Prenotazioni.class)
	private Set<Prenotazioni> utenteSet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Prenotazioni> getPrenotazSet() {
		return utenteSet;
	}

	public void setPrenotazSet(Set<Prenotazioni> prenotazSet) {
		utenteSet = prenotazSet;
	}

	
	
	
}

