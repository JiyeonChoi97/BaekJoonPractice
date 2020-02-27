package Lv9_Math2;
//네번째 점

import java.util.Scanner;

public class Q3009 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		int arrX[] = new int[3];
		int arrY[] = new int[3];

		for(int i=0;i<3;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arrX[i] = x;
			arrY[i] = y;
		}

		if(arrX[0]==arrX[1]) System.out.print(arrX[2] + " ");
		else if(arrX[0] == arrX[2]) System.out.print(arrX[1] + " ");
		else System.out.print(arrX[0] + " ");

		if(arrY[0]==arrY[1]) System.out.print(arrY[2]);
		else if(arrY[0] == arrY[2]) System.out.print(arrY[1]);
		else System.out.print(arrY[0]);

	}



}