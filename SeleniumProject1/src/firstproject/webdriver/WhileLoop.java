package firstproject.webdriver;

public class WhileLoop {
	public static void main(String[] args) {
		
		int n=323,r,sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;//3//2//3
			sum=(sum*10)+r;//3//32//323
			n=n/10;//32//3//0
		}
		if(temp==sum) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("it is not");
		}
	}
}