package Lv7;
// A B 숫자를 거꾸로 읽고 크기 비교

import java.util.Scanner;

public class Q2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String strA = Integer.toString(a);
		String strB = Integer.toString(b);
		
		
		String word = null;

		for(int i=2;i>=0;i--){
			if(strA.charAt(i)>strB.charAt(i)){
				word=strA;
				break;
			} else if(strA.charAt(i)==strB.charAt(i)){
				if(i==0){
					word=strA;
				}
			} else {
				word=strB;
				break;
			}
		}
		for(int i=2;i>=0;i--){
			System.out.print(word.charAt(i));
		}

		
	}

}
