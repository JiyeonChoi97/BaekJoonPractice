package LV3;

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n,x;
		do{
			n = sc.nextInt();
			x = sc.nextInt();
		}while(n<1||n>10000||x<1||x>10000);
		
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++){
			arr[i]=sc.nextInt();
			if(arr[i] <x){
				System.out.println(arr[i]);
			}
		}
	}

}
