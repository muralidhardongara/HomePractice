package firstproject.webdriver;

public class ReversseOf {

	public static void main(String[] args) {
		String s = "murali";
		int n = s.length();
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
