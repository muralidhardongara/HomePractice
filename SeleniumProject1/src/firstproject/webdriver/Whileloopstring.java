package firstproject.webdriver;

import java.util.Scanner;

public class Whileloopstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String real = sc.next();
		int n = real.length();
		String reverse = "";
		// boolean sub = real.startsWith("m");
		// System.out.println(sub);

		for (int i = n - 1; i >= 0; i--) {
			reverse = reverse + real.charAt(i);
		}
		if (real.equals(reverse)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not");
		}

	}
}