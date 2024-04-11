package Main;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int j = sc.nextInt();
	
	long num =1;
	
	for (int i=1; i<=j; i++) {
		num*=i;
	}
	System.out.println(num);
	}

}
