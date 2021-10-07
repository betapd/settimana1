package com.max.tipidati;

import java.util.Scanner;

public class LancioDadi {
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in); // per i dati in input
		
		 
		 
		
		 
		 
		 boolean stop=false;
		 
		 while(!stop) {
			 System.out.println("\nPrimo lancio:");
			 int lancio1 = in.nextInt();
			 System.out.println("Secondo lancio:");
			 int lancio2 = in.nextInt();
			 
			 int sum=lancio1+lancio2;
			 
			if(sum==7|| sum==11) {
				stop=true;
				 System.out.println("Hai vinto !!:");
			}else if(sum!=2|| sum!=3 || sum!=12){
				 System.out.println("\nG1 lancia di nuovo:");
				  lancio1 = in.nextInt();
				 System.out.println("G2 lancia di nuovo:");
				  lancio2 = in.nextInt();
				
			}
			if(sum==2|| sum==3 || sum==12) {
				stop=true;
				 System.out.println("Hai perso !!:");
			}
		 }
		 
		 
		 
		 
		 if(stop) {
			 System.out.println("Vince giocatore1:");
		 }else {
			 System.out.println("Giocatore2 perde:");
		 }
		
		
	}
}
