package Lv8_Math1;
// 분수찾기

import java.util.Scanner;

public class Q1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++){
			count = count + i;
			if(n==1){
				System.out.println("1/1");
				break;
			}
			if(n<=count&&n>count-i){
				if(i%2==0){
					System.out.print(n-(count-i));
					System.out.print("/");
					System.out.print((i+1)-(n-(count-i)));
					break;
				} else {
					System.out.print((i+1)-(n-(count-i)));
					System.out.print("/");
					System.out.print(n-(count-i));
					break;
					
				}
			}
		}
	}

}
