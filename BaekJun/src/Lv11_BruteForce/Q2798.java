// ∫Ì∑¢¿Ë
package Lv11_BruteForce;

import java.util.Scanner;

public class Q2798 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		int sum=0;
		int max=0;
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		for(int j = n-1;j>=0;j--){
			for(int k = j-1;k>=0;k--){
				for(int z=k-1;z>=0;z--){
					sum=arr[z]+arr[k]+arr[j];
					if(sum<=m) {
						if(max>=sum) max = max;
						else max = sum;
					}
				}
			}
		}
		System.out.println(max);
	}

}
