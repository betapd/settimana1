package esercizi;


import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar {
	private Date data;

	Calendar(int anno, int mese, int giorno) {
		GregorianCalendar cal = new GregorianCalendar(anno, giorno, mese);
		this.data = cal.getTime();
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