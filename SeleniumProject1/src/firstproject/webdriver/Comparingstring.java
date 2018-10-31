package firstproject.webdriver;

public class Comparingstring {

	public static void main(String[] args) {
		String str = "muralidhar";
		int n = str.length();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
				}
			}
		}
	}
}
