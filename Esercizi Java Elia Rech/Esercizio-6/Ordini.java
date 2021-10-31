package com.elia.Ordini;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordini {
	static Scanner ord = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Cliente> cli = new ArrayList<Cliente>(); // Create an ArrayList object
		ArrayList<Prodotti> menu = new ArrayList<Prodotti>(); // Create an ArrayList object

		int Ordine[] = new int[10];
		System.out.println("Inserisci il nome");
		String nome = ord.next();
		System.out.println("Inserisci il cognome");
		String cognome = ord.next();
		System.out.println("Inserisci l'età");
		int eta = ord.nextInt();
		Cliente c = new Cliente(nome, cognome, eta);
		cli.add(c);

		Prodotti ord1 = new Prodotti("Pasta", 1, 7.50);
		Prodotti ord2 = new Prodotti("Riso", 2, 15.50);
		Prodotti ord3 = new Prodotti("Ribs", 3, 12.50);
		Prodotti ord4 = new Prodotti("Fagioli", 4, 10.50);
		Prodotti ord5 = new Prodotti("Tonno", 5, 8.50);
		Prodotti ord6 = new Prodotti("Miso", 6, 2.50);

		menu.add(ord1);
		menu.add(ord2);
		menu.add(ord3);
		menu.add(ord4);
		menu.add(ord5);
		menu.add(ord6);

		System.out.println("Visualizza il menù");
		for (Prodotti o : menu) {
			System.out.println(o.getNumero() + "-" + o.getNome() + "-" + o.getPrezzo());
		}
		System.out.println("Cosa vuoi ordinare");
		{
			numero(menu, 0, Ordine);
			System.out.println(c.getNome() + "-" + c.getCognome());
			for (int i = 0; i < Ordine.length; i++) {
				for (Prodotti o : menu) {
					if (o.getNumero() == Ordine[i])
						System.out.println(o.getNumero() + " " + o.getNome());
				}
			}

		}
	}

	public static int[] numero(ArrayList<Prodotti> menu, int j, int Ordine[]) {

		System.out.println("Scegli l'ordine");
		int n = ord.nextInt();
		for (Prodotti p : menu) {
			if (p.getNumero() == n) {
				Ordine[j] = n;
				j++;
			}
		}
		System.out.println("Vuoi altro? Si o No");
		int dec = ord.nextInt();
		if (dec == 1) {
			numero(menu, j, Ordine);
		} else {
			return Ordine;
		}
		return Ordine;
	}
}
