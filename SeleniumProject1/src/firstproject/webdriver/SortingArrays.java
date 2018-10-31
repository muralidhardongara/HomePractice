package firstproject.webdriver;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {

		int a[] = { 21, 32, 43, 54, 64, 4, 3 };

		Arrays.sort(a);
		int n = a.length;
		//third largest value
		System.out.println("third largest value in a" + a[n - 3]);
		//smallest value in array
		System.out.println("smallest value in aray is"+a[0]);

		for (int i = 0; i <= n - 1; i++) {
			//ascending order
			System.out.println(a[i]);
		}
		for(int j=n-1;j>=0;j--) {
			//descending order
			System.out.println(a[j]);
		}

	}
}
