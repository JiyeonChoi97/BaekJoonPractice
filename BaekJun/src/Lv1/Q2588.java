package Lv1;
// lv1
import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int n1 = num2/100;
		int n2 = (num2-n1*100)/10;
		int n3 =  num2 - n1*100 - n2*10;
		
		int a3 = num1 * n3;
		int a4 = num1 * n2;
		int a5 = num1 * n1;
		int a6 = a3 + a4*10 + a5*100;
		
		System.out.println(a3+"\n"+a4+"\n"+a5+"\n"+a6);
	}

}
