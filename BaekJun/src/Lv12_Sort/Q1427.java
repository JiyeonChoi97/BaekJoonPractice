// 소트인사이드
// 주어진 수의 각 자리수를 내림차순으로 정렬
package Lv12_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1427 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		int ten = 1, sum = 0, check=1;
		if(n<10) check = 10;
		do{
			list.add(n%10);
			n /= 10;
		}while(n>10);
		list.add(n);
		
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
			int index = list.get(i);
			sum += index * ten;
			ten *= 10;
		}
		bw.write(String.valueOf(sum/check));
		bw.close();
	}

}
