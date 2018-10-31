package firstproject.webdriver;

public class StringClass {

	public static void main(String[] args) {
		String str = "muralidhar";
		System.out.println("length of string is" + str.length());

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}
}
