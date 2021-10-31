package com.elia.mcd;


import java.util.Scanner;



public class Mcd {
public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	
	int m1[] = new int[25];
	int m2[] = new int[25];
	int nP[] = new int[50];
	
	System.out.println("Inserisci il primo numero: ");
	int n0 = numero.nextInt();
	
	System.out.println("Inserisci il secondo numero:");
	int n1 = numero.nextInt();
	
	int z = 1;
	nP[0] = 2;
	// POPOLO L'ARRAY CON I NUMERI PRIMI
	for(int i = 1; i < 100 ; i=i+2)
	{
		boolean ok = true;
		for(int j = 1; j < 100 && (j<i) && ok  ; j++)
		{
		 if(j%i != 0)
			{
				nP[z] = i;
				z++;
				ok = false;
			}
			
		}
	}
	int t = 0;
	int y = 0;
	int i = 0;
	while(i <= n0)
	{
		if(n0%nP[i] == 0)
		{
			y = n0/nP[i];
			m1[t] = nP[i];
			t++;
			i=0;
			n0 = y;
		}
		else
		{
			i++;
		}
		
	}
	t=0;
	y=0;
	i=0;
			while(i <= n1)
			{
				if(n1%nP[i] == 0)
				{
					y = n1/nP[i];
				
					m2[t] = nP[i];
					t++;
					i=0;
					n1 = y;
				}
				else
				{
					i++;
				}
				
			}
	
			for(i = 0 ; i < m1.length;i++)
			{
				if(m1[i] != 0)
				System.out.println("MCD 1 = " + m1[i]);
			}
			for(i = 0 ; i < m2.length;i++)
			{

				if(m2[i] != 0)
				System.out.println("MCD 2 = " + m2[i]);
			}
			numero.close();
}

}
