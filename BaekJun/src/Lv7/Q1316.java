// 그룹 단어 체커

package Lv7;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = num;
		
		for(int i=0;i<num;i++){
			String word = sc.next();
			String[] arr = word.split("");
			ArrayList<String> check = new ArrayList<String>();
			
			for(int j=0;j<arr.length;j++){
				if(check.contains(arr[j])){
					if(!check.get(check.size()-1).equals(arr[j])){
						count --;
						break;
					}
						
				} else {
					check.add(arr[j]);
				}
			}
			
			
		}
		
		System.out.println(count);
	}

}
