import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값 : ");
		int num1=sc.nextInt();
		
		System.out.print("+ - * / 중에 선택 : ");
		String name =sc.next();
		
		System.out.print("두번째 값 : ");
		int num2=sc.nextInt();
		
		switch(name) {
		
		case "+":
			sum(num1,num2);
		
		case "-":
			min(num1,num2);
		
		case "*":
			mul(num1,num2);
		
		case "/":
			div(num1,num2);
		}
		
		
		
	}

	static int sum(int num1, int num2) {
			int i = num1+num2;
			System.out.println(i);
		return i ;
	}
	
	static int min(int num1, int num2) {
		int i = num1-num2;
		System.out.println(i);
	return i ;
	}
	
	static int mul(int num1, int num2) {
		int i = num1*num2;
		System.out.println(i);
	return i ;
	}
	
	static float div(float num1, float num2) {
		float i = num1/num2;
		System.out.println((float)i);
	return i ;
	}

}
