// ºĞÇØÇÕ 
// ex) 216 --> 198 = 1+9+8+198=216
package Lv11_BruteForce;

import java.util.Scanner;

public class Q2231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = 0, tmp=n, min=0;
		while(tmp>0){
			length++;
			tmp/=10;
		}
		for(int i = n;i>=0;i--){
			int sum = 0, ten = 10;
			for(int j=0;j<length;j++){
				int num = (i % ten) / (ten/10);
				ten*=10;
				sum += num;
			}
			sum+=i;
			if(sum==n){
				min = i;
			}
		}
		System.out.println(min);
	}

}
