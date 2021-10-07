package Esercici;

public class StampaPrimi {  
	  public static void main(String [] args){
		  int x = 2;
			
			for (int i=2; i<100; i++) {
				if (primo(x))
					System.out.println(i);
			}
	  }
	  public static boolean primo(int n){   //questo metodo restituisce true se il numero � primo
	    if (n<2)   //il primo numero primo � il 2, quindi se abbiamo un numero minore a 2 allora non sar� primo
	      return false;
	    if (n<=3)  //se il numero in questione � minore o uguale a 3 allora a questo punto si tratta del 2 o del 3, entrambi primi
	      return true;
	    if (n%2==0)  //se dividendo per 2 il numero si ha resto uguale a zero allora � un numero pari (maggiore a 2) quindi primo
	      return false;
	    for (int i=3;i<n;i=i+2){      /* si fa un ciclo partendo con i che da 3 assume i numeri dispari minori al numero da esaminare n, non serve controllare con i numeri pari perch� n non � pari  */
	      if ( n%i==0)   // se n dovesse essere divisibile per un qualche i allora non � primo
	        return false;   
	    }
	    return true;    //se si � giunti fin qui allora il numero n � primo
	  }
	}
