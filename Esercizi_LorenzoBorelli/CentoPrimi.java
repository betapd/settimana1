package esercizi;

public class CentoPrimi {
	public static void main(String[] args) {

		int end = 100;

		for (int i = 1; i <= end; i++) {
			if (isPrimo(i)) {

				int j = 0;
				int[] numPrimi = new int[j + 1];
				numPrimi[j] = i;
				System.out.println(numPrimi[j]);
				j++;

			}
		}
	}

	public static boolean isPrimo(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i <= n / 2; i++) {
			if ((n % i) == 0)
				return false;
		}

		return true;
	}

}
