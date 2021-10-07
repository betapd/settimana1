package com.es.dadi;




/* Ogni giocatore lancia due dadi.  
Se la somma al primo tiro è 7 o 11 il giocatore ha vinto. 
Se la somma al primo tiro è 2,3 o 12 il giocatore ha perso. 
Se la somma al primo tiro è 4,5,6,8,9 o 10 questa somma diventa il punteggio. 
Per vincere è necessario continuare a tirare i dati finchè non si totalizza il punteggio realizzato con il primo tiro. 
Il giocatore perde se totalizza 7 prima di raggiungere il punteggio del primo tiro. */

public class Dadi {
	
	public static void main(String[] args) {
		
	    int a1 = lancioDado();
	    int a2 = lancioDado();
	    
	    int b1;
	    int b2;
	    
		
		boolean flag = true;
		
		while(flag) {
			//primo tiro
			int primoTiro = a1 + a2;
			if(primoTiro == 7 || primoTiro == 11) {
				System.out.println("Hai vinto");
				flag = false;	
			} else if(primoTiro == 2 || primoTiro == 3 || primoTiro == 12  ){
				System.out.println("Hai perso");
				flag = false;
			} else {
				
				System.out.println("primo tiro " + primoTiro);
				
				while(flag) {
					b1 = lancioDado();
					b2 = lancioDado();
					int secondoTiro = b1 + b2;
					System.out.println("secondo tiro " + secondoTiro);
					if(secondoTiro == primoTiro) {
						System.out.println("Hai vinto, il tuo punteggio è: " + primoTiro + ". Nel secondo tiro hai fatto " + secondoTiro );
						flag= false;
					} else if (secondoTiro == 7) {
						System.out.println("Hai perso");
						flag= false;
					} 
					
				}
			}
			
			
		}
		
		
	}
	
	
	
	
	private static int lancioDado(){
		int tiro = ((int)(Math.random()*6)+1);
		return tiro;
	}
	
}
