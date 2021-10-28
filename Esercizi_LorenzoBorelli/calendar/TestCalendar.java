package esercizi;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class TestCalendar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Add month: ");
		int MESE = in.nextInt() - 1;
		System.out.println("Add year: ");
		int ANNO = in.nextInt();

		GregorianCalendar gregCal = new GregorianCalendar();

		int giornoC = gregCal.get(Calendar.DAY_OF_MONTH);
		int meseC = gregCal.get(Calendar.MONTH);
		int annoC = gregCal.get(Calendar.YEAR);

		System.out.println();
		SimpleDateFormat DayFormat = new SimpleDateFormat("EE", Locale.getDefault());
		SimpleDateFormat Format = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());

		gregCal.set(Calendar.MONTH, MESE);
		gregCal.set(Calendar.YEAR, ANNO);
		gregCal.set(Calendar.DAY_OF_MONTH, 1);

		System.out.println(Format.format(gregCal.getTime()).toUpperCase());

		int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
		int lastDayOfWeek = firstDayOfWeek + 7;

		for (int i = firstDayOfWeek; i < lastDayOfWeek; i++) {
			Calendar c = GregorianCalendar.getInstance();
			c.set(Calendar.DAY_OF_WEEK, i);
			System.out.print(DayFormat.format(c.getTime()).toUpperCase() + "\t");
		}
		System.out.println();

		for (int i = firstDayOfWeek; i < gregCal.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= gregCal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			gregCal.set(Calendar.DAY_OF_MONTH, i);
			if (gregCal.get(Calendar.DAY_OF_WEEK) == (firstDayOfWeek - 1) % 7 + 1) {
				System.out.println();
			}
			if (annoC == gregCal.get(Calendar.YEAR) && meseC == gregCal.get(Calendar.MONTH)
					&& giornoC == gregCal.get(Calendar.DAY_OF_MONTH)) {
				System.out.print(gregCal.get(Calendar.DAY_OF_MONTH) + "*_*\t");
			} else {
				System.out.print(gregCal.get(Calendar.DAY_OF_MONTH) + "\t");
			}
		}
	}

}