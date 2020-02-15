package Lv4;
// 더하기 사이클
import java.util.Scanner;

public class Q1110 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		do{
			n = sc.nextInt();
		}while(n<0||n>99);
				
		int count =0, nextN=0;
		int finalN = n;
		if(finalN==0) count++;
		while(finalN!=nextN){
			int sum=0;				
			if(n<10){
				nextN = n*10 +n ;
				n=nextN;
				count++;
			} else {
				sum = n %10 + n /10;
				nextN = (n %10)*10 + sum%10;
				n=nextN;
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}

}
