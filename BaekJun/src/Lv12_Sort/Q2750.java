// N개의 수를 오름차순으로 정렬
package Lv12_Sort;

import java.util.Scanner;

public class Q2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		sort(arr,n);
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}

	 static void sort(int[] arr,int n) {
		 for(int i=n;i>1;i--){
			 for(int j=1;j<i;j++){
				 if(arr[j]<arr[j-1]){
					 int temp = arr[j];
					 arr[j] = arr[j-1];
					 arr[j-1] = temp;
				 }
			 }
		 }
	}

}
