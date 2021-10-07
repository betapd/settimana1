package Esercici;

public class Dadi {

	public static void main(String[] args) {

		int[] c, d = new int[2];
		c = throwdadi();
		boolean end = true;

		while (end) {
			if ((c[0] + c[1] == 7) || (c[0] + c[1] == 11)) {
				System.out.println("you win");
				end = false;
			} else if ((c[0] + c[1] == 2) || (c[0] + c[1] == 12) || (c[0] + c[1]) == 3) {
				System.out.println("you lose");
				end = false;
			} else {
				int somma1 = c[0] + c[1];
				d = throwdadi();
				if (d[0] + d[1] == 7) {
					System.out.println("you lose");
					end = false;
				} else if (d[0] + d[1] == somma1) {
					System.out.println("you win");
					end = false;
				}
			}
		}
	}

	private static int[] throwdadi() {

		int number1 = ((int) (Math.random() * 6) + 1);
		int number2 = ((int) (Math.random() * 6) + 1);

		int[] lancio = { number1, number2 };
		return lancio;
	}
}
