package com.elia.numeriprimi;

public class NumeriPrimi {
public static void main(String[] args) {
	
	for(int i = 1; i < 100 ; i=i+2)
	{
		boolean ok = true;
		for(int j = 1; j< 100 && j<i && ok ; j++)
		{
			if(j%i != 0)
			{
				System.out.println(i);
				ok = false;
			}
		}
	}
}

}
