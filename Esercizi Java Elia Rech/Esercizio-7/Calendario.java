package com.elia.calendario;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Calendario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci l'anno");
		int anno = input.nextInt();
		System.out.println("Inserisci il mese");
		int mese = input.nextInt();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
		LocalDateTime now = LocalDateTime.now();

		String iDay = (dtf.format(now).toString());
		int day = Integer.parseInt(iDay);

		// Get the number of days in that month
		YearMonth yearMonthObject = YearMonth.of(anno, mese);
		int daysInMonth = yearMonthObject.lengthOfMonth();
		yearMonthObject = YearMonth.of(anno, mese);
		daysInMonth = yearMonthObject.lengthOfMonth();

		for (int i = 1; i <= daysInMonth; i++) {
			if (day != i)
			{
				if(i % 7 != 0)
				System.out.print(i + " ");
				else
				System.out.println(i);
			}
				
			else
				System.out.print("* ");
		}

	}
}
