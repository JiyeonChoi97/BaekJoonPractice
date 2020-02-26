package Lv8_Math1;

import java.util.Scanner;

public class Q2775 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		int sum = 0;

		for(int c=0;c<testCase;c++){
			int floor = sc.nextInt();
			int roomNum = sc.nextInt();

			int[][] apartment = new int[floor + 1][roomNum];

			for(int i=0; i<roomNum; i++) {
				apartment[0][i] = i + 1;
			}

			for(int i=1; i<floor + 1; i++) {
				for(int j=0; j<roomNum; j++) {
					for(int k=0; k<=j; k++) {
						sum += apartment[i-1][k];
					}
					apartment[i][j] = sum;
					sum = 0;
				}
			}
			System.out.println(apartment[floor][roomNum - 1]);
		}

	}
}

