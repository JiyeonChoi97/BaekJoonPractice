package Lv10_Recursive;

import java.util.Scanner;

//Àç±Í º°Âï±â
public class Q2447 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[][] arr = new String[n][n];

		for(int i= 0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= "*";
			}
		}

		f(n, n, arr);

		for(int i= 0;i<n;i++) {
			for(int j=0;j<n;j++) { 
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

	static void f(int n, int originalN, String[][] arr) {

		if(n==1) {
			return;
		}
		else{
			n=n/3;
			for(int k=0;k<originalN;k+=n){
				if(k%(n*3)==0){
					for(int k1=0;k1<originalN;k1+=n){
						if(k1%(n*3)==0){
							for(int i=n+k;i<2*n+k;i++){
								for(int j=n+k1;j<2*n+k1;j++) {
									arr[i][j]=" ";
								}
							}
						}
					}
				}
			}
		}
		f(n, originalN, arr);
		}

}