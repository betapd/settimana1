package com.studente;

public class StudenteTest {

	public static void main(String[] args) {
		
		Studenti s1=new Studenti("Marco","Bianchi",103010);
		Studenti s2=new Studenti("Marco","Bianchi",104010);
		Studenti s3=new Studenti("Marco","Bianchi",105010);
		Studenti s4=new Studenti("Marco","Bianchi",106010);
		Studenti s5=new Studenti("Marco","Bianchi",107010);
		Studenti s6=new Studenti("Marco","Bianchi",108010);
		Studenti s7=new Studenti("Marco","Bianchi",109010);
		
		Esami e1=new Esami("Algoritimi strutture dati","12",103010);
		Esami e2=new Esami("Algoritimi strutture dati","12",104010);
		Esami e3=new Esami("Algoritimi strutture dati","12",105010);
		Esami e4=new Esami("Algoritimi strutture dati","12",106010);
		Esami e5=new Esami("Algoritimi strutture dati","12",107010);
		Esami e6=new Esami("Algoritimi strutture dati","12",108010);
		Esami e7=new Esami("Algoritimi strutture dati","12",109010);
		
		Studenti[] studente= new Studenti[7];
		
		studente[0]=s1;
	    studente[1]=s2;
		studente[2]=s3;
		studente[3]=s4;
		studente[4]=s5;
		studente[5]=s6;
		studente[6]=s7;
		
		Esami[] esame= new Esami[7];
		
		esame[0]=e1;
	    esame[1]=e2;
		esame[2]=e3;
		esame[3]=e4;
		esame[4]=e5;
		esame[5]=e6;
		esame[6]=e7;
		
		int count=0;
		for(int i=0; i<studente.length; i++) {
			if(studente[i].getMatricola()==esame[i].getMatricola()) {
				count++;
				System.out.println("Nome e cognome: "+studente[i].getName()+" "+studente[i].getCognome()+" "+" Matricola: "+esame[i].getMatricola());
				
			}
			
		}
		System.out.println("Numero studenti: "+count);
		
		
		
		
	}

}
