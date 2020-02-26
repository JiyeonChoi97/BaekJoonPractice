package Lv9_Math2;

import java.util.Scanner;

public class Q1085 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int temp = 0;
		
		if((w-x)<=(h-y)) temp = w-x;
		else temp = h-y;
		
		if(temp<=x) temp = temp;
		else temp = x;
		
		if(temp<=y) temp = temp;
		else temp = y;

		System.out.println(temp);
	}

}
