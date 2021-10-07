package Esercici;

import java.util.Scanner;

public class mcd {
	public static void main (String[] args) {
		
		java.util.Scanner in = new Scanner(System.in);
		
		System.out.println("insaerire il primo numero: ");
		int num1 = in.nextInt();
		System.out.println("insaerire il secondo numero: ");
		int num2 = in.nextInt();
		in.close();
		
		int i = num1;
		int j = num2;
		if(num1>num2) {
			i = num2;
			j = num1;
		}
		
		int tmpInt;
		while((tmpInt = i %j) != 0) {
			i=j;
			j=tmpInt;
		}
	System.out.println("MCD di "+num1+" e "+num2+" è ---->"+j );
	}
}
