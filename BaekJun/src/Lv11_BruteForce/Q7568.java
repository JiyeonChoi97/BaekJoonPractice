package Lv11_BruteForce;
// 등치 등수 구하기

import java.util.Scanner;

public class Q7568 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int people[][] = new int[n][2];
		for(int i=0;i<n;i++){
			people[i][0] = sc.nextInt();
			people[i][1] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int count = 0;
			for(int j=0;j<n;j++){
				if(people[j][0]>people[i][0]){
					if(people[j][1]>people[i][1])
						count++;
				}
			}
			System.out.print(count+1 + " ");
		}
	}

}
