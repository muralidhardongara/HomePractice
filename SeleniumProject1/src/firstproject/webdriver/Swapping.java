package firstproject.webdriver;

public class Swapping {
	public static void main(String[] args) {
		
		int a=5;
		int b=3;
		System.out.println("a value before"+a);
		System.out.println("a value before"+b);
		
		a=a+b;//8
		b=a-b;//5
		a=a-b;
		
		System.out.println("a value before"+a);
		System.out.println("a value before"+b);
	}

}
