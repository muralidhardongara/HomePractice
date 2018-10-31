package firstproject.webdriver;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number for check");
		int p = sc.nextInt();
		int q = 0;
		int r = p / 2;
		if (p == 0 || p == 1) {
			System.out.println("it is not prime ");
		} else {
			for (int i = 2; i <= r; i++) {
				if (p % i == 0) {
					System.out.println("it is not prime");
					q = 1;
					break;
				}
			}
			if (q == 0) {
				System.out.println("it is a prime number");
			}
		}
	
	}
}