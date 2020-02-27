package Lv10_Recursive;

import java.util.Scanner;

//피보나치수열
public class Q10870 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int f2=0, f1=1;
		f(n, f2, f1);
	}

	static void f(int n, int f2, int f1) {

		if(n==0) System.out.println("0");
		else if(n==1) System.out.println(f1);
		else {
			int f=f2+f1;
			f2=f1;
			f1=f;
			f(n-1, f2, f1);
		}
	}

}
