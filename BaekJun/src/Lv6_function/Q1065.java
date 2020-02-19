package Lv6_function;
import java.util.Scanner;

//ÇÑ¼ö
public class Q1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		do{
			n = sc.nextInt();
		}while(n<1||n>1000);

		f(n);

	}

	static void f(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		if(n<100) count = n;
		else {
			count=99;
			for(int i = 100;i<=n;i++) {
				int hun=i/100;
				int ten=(i-hun*100)/10;
				int one = i%10;
				if(hun-ten==ten-one) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}