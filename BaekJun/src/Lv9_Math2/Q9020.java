package Lv9_Math2;

import java.util.Scanner;

public class Q9020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0; i<t;i++){
			int n=sc.nextInt();
			int n2 = n/2;
			for(int j=0;j<n2-1;j++){
				int leftN = n2 -j;
				int rightN = n2 + j;
				int flag = 0;
				if(leftN==2||rightN==2){
					flag = 0;
				} else {
					for(int k=2;k<=(int)Math.sqrt(leftN)+1;k++) {
						if(leftN%k==0) {
							flag = 1;
							break;
						}
					}
					for(int k=2;k<=(int)Math.sqrt(rightN)+1;k++) {
						if(rightN%k==0) {
							flag = 1;
							break;
						}
					}
				}
				if(flag ==0){
					System.out.println(leftN + " " + rightN);
					break;
				}
			}
		}
	}

}
