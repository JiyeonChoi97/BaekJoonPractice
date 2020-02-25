// ¹úÁý
package Lv8_Math1;

import java.util.Scanner;

public class Q2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=1;
		
		for(int i=0;i<n;i++){
			num=num+i*6;
			if(n==1){
				System.out.println(1);
				break;
			}
			if(n>num-6*i&&n<=num){
				System.out.println(i+1);
				break;
			}
		}
	}

}
