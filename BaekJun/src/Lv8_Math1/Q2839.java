package Lv8_Math1;
// ¼³ÅÁ¹è´Þ
import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int numFive, count=0;
		
		for(numFive=n/5;numFive>=0;numFive--) {
			if(n-numFive*5==0){
				count = numFive;
				break;
			}
			else if((n-numFive*5)%3==0){
				count = numFive + (n-numFive*5)/3;
				break;
			}
				
		}
		if(count==0) count=-1;
		
		System.out.println(count);
	}

}
