package Lv10_Recursive;

//ÆÑÅä¸®¾ó (Àç±Í)

import java.util.Scanner;

public class Q10872 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 1;
		factorial(n, sum);
	}

	static void factorial(int n, int sum) {
		if(n==0) System.out.println(sum);
		else {
			sum *= n;
			factorial(n-1, sum);
		}	
	}

}