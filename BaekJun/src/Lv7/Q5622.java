package Lv7;

import java.util.Scanner;

//다이얼 전화기
public class Q5622 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count = 0;

		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='A'||word.charAt(i)=='B'||word.charAt(i)=='C') {
				count +=3;
			} else if(word.charAt(i)=='D'||word.charAt(i)=='E'||word.charAt(i)=='F') {
				count +=4;            
			} else if(word.charAt(i)=='G'||word.charAt(i)=='H'||word.charAt(i)=='I') {
				count +=5;         
			} else if(word.charAt(i)=='J'||word.charAt(i)=='K'||word.charAt(i)=='L') {
				count +=6;            
			} else if(word.charAt(i)=='M'||word.charAt(i)=='N'||word.charAt(i)=='O') {
				count +=7;            
			} else if(word.charAt(i)=='P'||word.charAt(i)=='Q'||word.charAt(i)=='R'||word.charAt(i)=='S') {
				count +=8;            
			} else if(word.charAt(i)=='T'||word.charAt(i)=='U'||word.charAt(i)=='V') {
				count +=9;         
			} else if(word.charAt(i)=='W'||word.charAt(i)=='X'||word.charAt(i)=='Y'||word.charAt(i)=='Z') {
				count +=10;         
			}
		}
		System.out.println(count);
	}
}

