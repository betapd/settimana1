package com.data.parking;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ParkingTest {


	public static void main(String[] args) {
		Parking park=new Parking();
		SimpleDateFormat format= new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss", Locale.ITALIAN);
		
		
		System.out.println("giorno: " + format.format(new GregorianCalendar(2021, 10, 17, 8, 00, 00).getTime()));
		park.printParkIsFull();
		System.out.println();
		
		System.out.println("Arriva l'auto 1, Targa: XN45Y");
		park.insertCar(new Parkimetro("XN45Y", new GregorianCalendar(2021, 10, 17, 10, 20, 20), 5));
		park.printParkIsFull();
		System.out.println();
		
		System.out.println("Arriva l'auto 2, Targa: XK45Y");
		park.insertCar(new Parkimetro("XN45Y", new GregorianCalendar(2021, 10, 17, 10, 20, 20), 4));
		park.printParkIsFull();
		System.out.println();
		
		System.out.println("Arriva l'auto 3, Targa: XH45Y");
		park.insertCar(new Parkimetro("XN45Y", new GregorianCalendar(2021, 10, 17, 10, 20, 20), 3));
		park.printParkIsFull();
		System.out.println();
		
		
		
	}
}
