package firstproject.webdriver;

public class PrimeNumber1to100 {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i == 0 || i == 1) {
				//System.out.println();
			} else {
				int p = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						p = 1;
						break;
					}
				}
				if (p == 0) {
					System.out.print(" " + i);
				}
			}
		}
	}
}
