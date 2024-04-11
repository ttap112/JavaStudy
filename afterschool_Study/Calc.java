package m;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("num1?");
        num1 = sc.nextInt();
        System.out.print("num2?");
        num2 = sc.nextInt();
       
       
        System.out.print("+(1) -(2) *(3) /(4)");
        int op = sc.nextInt();        
        double result = 0;
       
        
        switch(op) {
        case 1:
            result = 더하기(num1, num2);
            break;
        case 2:
        	result = 빼기(num1, num2);
            break;
        case 3:
        	result = 곱하기(num1, num2);
            break;
        case 4:
        	result = 나누기(num1, num2);
            break;
        default:
            System.out.print("응 다시해~");        
        }
        System.out.println(System.getProperty("user.dir"));
    }
   
   static int  더하기(int number1, int number2) {
	   
	   int re=number1+number2;
	   System.out.println("결과 : "+re);
	   return re;
   }
   static int  빼기(int number1, int number2) {
	   
	   int re=number1-number2;
	   System.out.println("결과 : "+re);
	   return re;
   }
   static float  나누기(float number1, float number2) {
	   
	   float re=number1/number2;
	   System.out.println("결과 : "+re);
	   return re;
   }
   static int  곱하기(int number1, int number2) {
	   
	   int re=number1*number2;
	   System.out.println("결과 : "+re);
	   return re;
   }
   
 
    }
  

   
   
   
   
   
   

