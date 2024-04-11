package M;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int total=0;
		int avg=0;
		
		System.out.print("인원을 입력 하시오 : ");
		int m = sc.nextInt();
		
		for (int i=1; i<=m; i++) {
			System.out.print("점수를 입력하시오 : ");
			int n = sc.nextInt();
			
			total+=n;
		}
		avg= total/m;
		
		System.out.printf("총 %d명 의 총점은 %d 이고 평균은 %f 이다",m,total,(float)avg);
	
	
	}
}

