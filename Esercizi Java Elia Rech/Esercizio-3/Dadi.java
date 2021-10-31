package com.elia.dadi;

import java.util.Random;
import java.util.Scanner;


public class Dadi {
	public static void main(String[] args) {

		Random rand = new Random();
		int min = 1;
		int max = 6;
		int tiri = 0;
		int n0 = rand.nextInt((max - min) + 1) + min;
		int n1 = rand.nextInt((max - min) + 1) + min;
		int somma = 0;
		boolean partita = true;
		
		while (partita == true && somma <= 12) 
		{
		if(tiri > 0)
		{
			 n0 = rand.nextInt((max - min) + 1) + min;
			 n1 = rand.nextInt((max - min) + 1) + min;
		}
		somma = somma + (n0+n1);
		switch(somma)
		{
			case 7:
			case 11:
			System.out.println("Il giocatore ha vinto");	
			partita = false;
			break;
			
			case 2: 
			case 3:
			case 12:
			System.out.println("Il giocatore ha perso");
			partita = false;
			break;
			
			case 4: 
			case 5:
			case 6:
			case 8: 
			case 9:
			case 10:
			System.out.println("Il giocatore deve ritirare");
			partita = true;
			tiri++;
			break;
			
			default:
			somma = somma + (n0 + n1);	
		
		}

		if(somma > 12)
		{
			partita = false;
			System.out.println("Il giocatore ha perso");
	
		}
		}
	
	}
}
