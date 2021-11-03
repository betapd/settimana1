package com.data.parking;

import java.util.Collections;
import java.util.LinkedList;

public class Parking {
	
	LinkedList<Parkimetro> parkIsFull=new LinkedList<Parkimetro>();
	
	Parking(){
		
	}
	
	// stampa park occupati 
	public void printParkIsFull(){
		if(parkIsFull.isEmpty()) {
			System.out.println("Il parcheggio libero");
		}else {
			System.out.println("Size: "+parkIsFull.size());
//			for(int i=1; i<parkIsFull.size(); i++) {
//				System.out.println(i);
//			}
			for (Parkimetro t : parkIsFull) {
				System.out.println(t);
			}
		}
	}
	
	public void insertCar(Parkimetro p) {
		parkIsFull.addLast(p);
		
		// ordina la lista 
		Collections.sort(parkIsFull);
		if (parkIsFull.size() > 1) {
			do {
				if (parkIsFull.getFirst().calcolaUscita().compareTo(p.getEntrata()) < 0)
					parkIsFull.removeFirst();
			} while (parkIsFull.getFirst().calcolaUscita().compareTo(p.getEntrata()) < 0
					&& !(parkIsFull.getFirst().equals(p)));
		}
	}

}
