package com.calendar.data;

import java.util.Date;
import java.util.GregorianCalendar;

public class Calendario {
	private Date data;
	Calendario(int anno, int mese, int giorno) {
		GregorianCalendar cal=new GregorianCalendar(anno,giorno,mese);
		this.data=  cal.getTime();
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Calendario [data=" + data + "]";
	}

}
