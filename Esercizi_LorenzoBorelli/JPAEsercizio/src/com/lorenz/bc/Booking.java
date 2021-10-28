package com.lorenz.bc;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lorenz.bc.model.Prenotazioni;
import com.lorenz.bc.model.Utente;

public class Booking {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA"); // JPA nome del progetto

		EntityManager eM = factory.createEntityManager();
		eM.getTransaction().begin(); // inizia una transazione

		Utente u1 = new Utente();

		u1.setNome("Lorenzo");
		u1.setCognome("Borelli");
		u1.setUsername("lollo");
		
		Utente u2 = new Utente();

		u2.setNome("Massimo");
		u2.setCognome("Borelli");
		u2.setUsername("Max");

		Prenotazioni book1 = new Prenotazioni();
		book1.setMarca("nike");
		book1.setQuant("33");
		
		Prenotazioni book2 = new Prenotazioni();
		book2.setMarca("adidas");
		book2.setQuant("3323");
		
		Set<Prenotazioni> p = new HashSet<Prenotazioni>();
		p.add(book1);
		p.add(book2);
		
		Set<Prenotazioni> p2 = new HashSet<Prenotazioni>();
		p2.add(book1);
		
		u2.setPrenotazSet(p2);
		u1.setPrenotazSet(p);
		
		Set<Utente> listautente = new HashSet<Utente>();
		listautente.add(u1);
		listautente.add(u2);
		
		book1.setPrenotazSet(listautente);
		
		eM.persist(u1);
		eM.persist(u2);
		eM.persist(book1);
		eM.persist(book2);
		
		eM.getTransaction().commit();
		eM.close();
		factory.close();

	}
}