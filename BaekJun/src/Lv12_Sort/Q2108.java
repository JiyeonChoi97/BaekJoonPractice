// 통계학
package Lv12_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2108 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());	// n은 홀수
		List<Integer> list = new ArrayList<>();
		List<Integer> freq = new ArrayList<>();
		int sum = 0,max=0;
		double avg;
		int[] count = new int[8001];
		
		for(int i =0;i<n;i++){
			int value = Integer.parseInt(br.readLine());			
			list.add(value);
			sum += value;
			count[value+4000]++;
		}
		
		for(int i=0;i<count.length;i++){
			if(count[i]> max) max = count[i];
		}
		for(int i=0;i<count.length;i++){
			if(count[i]==max) freq.add(i-4000);
		}
		
		avg = sum / (double)n;
		bw.write(Math.round(avg) + "\n");		// 1. 산술 평균
		
		Collections.sort(list);
		bw.write(list.get(n/2) + "\n");	// 2. 중앙값
		
		if(freq.size()>1) bw.write(freq.get(1) + "\n");
		else bw.write(freq.get(0) + "\n");	 				// 3. 최빈값 출력
		
		bw.write(list.get(n-1)-list.get(0) + "\n"); // 4. 범위 출력 
		
		bw.close();
	}

}
