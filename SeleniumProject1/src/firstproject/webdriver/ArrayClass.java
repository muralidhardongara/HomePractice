package firstproject.webdriver;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 87, 8, 9 };
		System.out.println("size of an array" + a.length);
		System.out.println("charecter at 5th place is" + a[4]);
		for (int i = 0; i < a.length; i++) {
			System.out.println("char at i is" + a[i]);
		}
		for (int j = a.length - 1; j >= 0; j--) {
			System.out.println("char at" + a[j]);
		}
		String[] c = { "ant", "cat", "fox", "ball", "duck" };
		Arrays.sort(c);
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
	}
}
