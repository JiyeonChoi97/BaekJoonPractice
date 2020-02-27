package Lv9_Math2;

//Æ¼·¿
import java.util.Scanner;

public class Q1002 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();		
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();

			if(x1==x2&&y1==y2&&r1==r2) {
				System.out.println("-1");
				continue;
			} else if(x1==x2&&y1==y2) {
				System.out.println("0");
				continue;
			}
			double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			if(distance<r1+r2&&Math.abs(r1-r2)<distance) System.out.println("2");
			else if(distance==r1+r2||Math.abs(r1-r2)==distance) System.out.println("1");
			else System.out.println("0");
		}
	}

}
