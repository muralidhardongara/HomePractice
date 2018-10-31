package firstproject.webdriver;

public class Avereageofnumbers {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8, 10 };
		int n = a.length;
		int sum = 0;

		for (int i = 0; i <= n - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum / n);
	}
}