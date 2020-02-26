package Lv9_Math2;

//M이상 N이해 소수 모두 출력
import java.util.Scanner;

public class Q1929 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int flag = 0;
		for(int j = m; j<=n;j++) {
			if(j==1) flag = 1;
			if(j==2) {
				System.out.println(2);
			}
			for(int i=2;i<=(int)Math.sqrt(j)+1;i++) {
				if(j%i==0) {
					flag = 1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(j);
			}
			flag = 0;
		}

	}

}