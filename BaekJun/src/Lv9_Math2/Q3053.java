package Lv9_Math2;
import java.util.Scanner;

//택시 기하학
public class Q3053 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double pi = 3.14159265358979;
		
		System.out.printf("%.6f\n", r*r*pi);
		System.out.printf("%.6f", (double)r*r*2);
	}

}