package com.data.prodotti;

public class prodottoTest {

	public static void main(String[] args) {

		Cliente[] dataiCliente = { 
									new Cliente("Alessia", "Neri"),
									new Cliente("Giorgio", "Bassi"),
									new Cliente("Alessio", "Marani"), 
									new Cliente("Marco", "Rossi") 
								 };
		Prodotto prod1 =new Prodotto("prod1",3.5);
		Prodotto prod2 =new Prodotto("prod2",6);
		Prodotto prod3 =new Prodotto("prod3",7);
		Prodotto prod4 =new Prodotto("prod4",2);
		Prodotto prod5 =new Prodotto("prod5",6);
		Prodotto prod6 =new Prodotto("prod6",30);
		Prodotto prod7 =new Prodotto("prod7",11);
		Prodotto prod8 =new Prodotto("prod8",15);
		
		Prodotto[] item1= {prod8,prod6,prod4,prod7};
		Prodotto[] item2= {prod1,prod7,prod3,prod8};
		Prodotto[] item3= {prod2,prod5,prod6,prod4};
		Prodotto[] item4= {prod3,prod4,prod8,prod5};
		Prodotto[] item5= {prod2,prod7,prod8,prod8,prod1};
		Prodotto[] item6= {prod1,prod5,prod3,prod4,prod1};
		Prodotto[] item7= {prod3,prod4,prod8,prod5};
		
		Ordine ordine1=new Ordine(dataiCliente[0],item1);
		Ordine ordine2=new Ordine(dataiCliente[0],item2);
		Ordine ordine3=new Ordine(dataiCliente[2],item3);
		Ordine ordine4=new Ordine(dataiCliente[2],item4);
		
		
		Ordine ordine5=new Ordine(dataiCliente[1],item5);
		Ordine ordine6=new Ordine(dataiCliente[3],item6);
		Ordine ordine7=new Ordine(dataiCliente[3],item7);
		

		
		for(int i=0; i<dataiCliente.length; i++) {
			System.out.println(dataiCliente[i]);
		}
	}

}
