package com.elia.array;

import java.util.Scanner;


public class StudenteTest {
	static Esame[] esame = new Esame[7];
	static Studente[] studente = new Studente[3];

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		System.out.println("Inserisci il numero:");
		int num = numero.nextInt();
		Studente(num);
		System.out.println("Inserisci il numero:");
		int n = numero.nextInt();
		Esame(n);
		Stampa();

	}

	public static void Studente(int i) {
		// INSERISCI STUDENTE
		
		for (int j = 0; j < i; j++) {
		
			Scanner exam = new Scanner(System.in);
			System.out.println("Inserisci Matricola:");
			int matricola = exam.nextInt();
			System.out.println("Inserisci Nome:");
			String nome = exam.next();
			System.out.println("Inserisci Cognome");
			String cognome = exam.next();
			System.out.println(matricola + " " + nome + " " + cognome);
			boolean trovato = true;
			
			for(int k = 0; k < j ; k++)
			{
				if(studente[k].getMatricola() == matricola)
				{
					System.out.println("Matricola già presente");	
					trovato = false;
				}
				
			}
			if(trovato == true)
			{
				studente[j] = new Studente(matricola, nome, cognome);
				System.out.println("Studente inserito con successo");
				trovato = true;
			}
		

		}
		for(int k = 0; k < studente.length; k++)
		{
			System.out.println(studente[k]);
		}
	}

	public static void Esame(int i) {
		// INSERISCI ESAME
		for (int j = 0; j < i; j++) {
			
			Scanner exa = new Scanner(System.in);
			System.out.println("Inserisci Matricola:");
			int matricola = exa.nextInt();
			System.out.println("Inserisci nome esame:");
			String exam = exa.next();
			System.out.println("Inserisci voto");
			int voto = exa.nextInt();
			System.out.println(matricola + " " + esame + " " + voto);
			esame[j] = new Esame(matricola, exam, voto); 
			}
		
	}
	public static void Stampa() {
		// INSERISCI ESAME
		for (int j = 0; j < studente.length && studente[j] != null; j++) 
			System.out.println(studente[j]);
	
		for(int i = 0; i < esame.length && esame[i] != null; i++)
			System.out.println(esame[i]);	
		}
	
}
