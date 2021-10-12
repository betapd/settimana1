package com.calendar.data;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarioTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire il mese: ");
		int MESE = in.nextInt() - 1;
		System.out.println("Inserire l'anno: ");
		int ANNO = in.nextInt();
		
		GregorianCalendar gregCal = new GregorianCalendar();
		
		int giornoC = gregCal.get(Calendar.DAY_OF_MONTH);
		int meseC = gregCal.get(Calendar.MONTH);
		int annoC = gregCal.get(Calendar.YEAR);
		
		System.out.println();
		SimpleDateFormat  DayFormat= new SimpleDateFormat("EE", Locale.getDefault());
		SimpleDateFormat Format = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());
		
		gregCal.set(Calendar.MONTH, MESE);
		gregCal.set(Calendar.YEAR, ANNO);
		gregCal.set(Calendar.DAY_OF_MONTH, 1);
		
		//ottengo mese anno formattato
		System.out.println(Format.format(gregCal.getTime()).toUpperCase());
		
		// ritorna i giorni della settimana
		int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
		int lastDayOfWeek = firstDayOfWeek + 7;
		
		
		//stama giorni della settimana
		for (int i = firstDayOfWeek; i < lastDayOfWeek; i++) {
			Calendar c = GregorianCalendar.getInstance();
			c.set(Calendar.DAY_OF_WEEK, i);
			System.out.print(DayFormat.format(c.getTime()).toUpperCase() + "\t");
		}System.out.println();
		
		// inserisce spazi
		for (int i = firstDayOfWeek; i < gregCal.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.print("\t"); // metto spazio fra i nomi
		}
		
		//System.out.println("prova: "+gregCal.getActualMaximum(Calendar.DAY_OF_MONTH));
		// stampa il calendario in base al mese anno scelto
		for (int i = 1; i <= gregCal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			gregCal.set(Calendar.DAY_OF_MONTH, i);
			if (gregCal.get(Calendar.DAY_OF_WEEK) == (firstDayOfWeek - 1) % 7 + 1) {
				System.out.println();
			}
			//aggiungo l'indicatore per il giorno corrente
			if (annoC == gregCal.get(Calendar.YEAR) && meseC == gregCal.get(Calendar.MONTH)
					&& giornoC == gregCal.get(Calendar.DAY_OF_MONTH)) {
				System.out.print(gregCal.get(Calendar.DAY_OF_MONTH) + "*_*\t");
			} else {
				System.out.print(gregCal.get(Calendar.DAY_OF_MONTH) + "\t");
			}
		}
	}


}
