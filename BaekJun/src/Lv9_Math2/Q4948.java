package Lv9_Math2;

import java.util.Scanner;

public class Q4948 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0) break;

			int count=0;

			for(int j = (n+1); j<=(2*n);j++) {
				if(j==1) break;
				if(j==2) count++;
				for(int i=2;i<=(int)Math.sqrt(j)+1;i++) {
					if(j%i==0) break;
					if(i==(int)Math.sqrt(j)+1) count++;
				}
			}
			System.out.println(count);
		}

	}
}
