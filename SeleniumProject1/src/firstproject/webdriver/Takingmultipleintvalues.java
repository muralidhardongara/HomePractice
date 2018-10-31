package firstproject.webdriver;

import java.util.Scanner;

public class Takingmultipleintvalues {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 4 numbers");
	
	int n=sc.nextInt();
	
	int n1[]=new int[n];
	for(int i=0;i<=n1.length;i++) {
		n1[i]=sc.nextInt();
	}
	
}
}
