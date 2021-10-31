package com.elia.parcheggi;

import java.util.LinkedList;
import java.util.Queue;

public class Parcheggio {
	public static void main(String[] args) {

		Queue<Macchina> q = new LinkedList<Macchina>();
		Queue<Macchina> q2 = new LinkedList<Macchina>();
		Macchina[] m = new Macchina[10];

		m[0] = new Macchina(9.00, 18.00);
		m[1] = new Macchina(9.01, 18.00);
		m[2] = new Macchina(9.03, 18.00);
		m[3] = new Macchina(9.02, 18.00);
		m[4] = new Macchina(9.06, 18.00);
		m[5] = new Macchina(9.05, 18.00);
		m[6] = new Macchina(8.59, 18.00);
		m[7] = new Macchina(8.00, 18.00);
		m[8] = new Macchina(7.00, 18.00);
		m[9] = new Macchina(6.00, 18.00);
		double X[] = new double[10];
		for (int i = 0; i < 10; i++)
			X[i] = 2000.00;
		for (int i = 0; i < m.length; i++) {
			q.add(m[i]);
		}
		int i = 0;
		for (int j = 0; j < 10; j++) {

			for (Macchina ins : q) {
				if (ins.getOrarioentrata() <= X[i]) {
					if (i > 0) {
						if (ins.getOrarioentrata() > X[i - 1])
							X[i] = ins.getOrarioentrata();
					} else {
						X[i] = ins.getOrarioentrata();
					}

				}
			}		
			for (Macchina ins2 : q) {

				if (ins2.getOrarioentrata() == X[i]) {
					q2.add(ins2);
					// System.out.println(ins2.getOrarioentrata());
				}

			}
			i++;
		}
		for(Macchina p : q2)
			System.out.println("L'orario di entrata delle macchina è: "+p.getOrarioentrata() + ". Mentre l'orario di uscita è: " + p.getUscita());

	}
}
