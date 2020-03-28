// N개의 수를 오름차순으로 정렬
// 카운팅 정렬
package Lv12_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		// 최댓값 10000
		int[] count = new int[10001];
		for (int i = 0; i < n; i++) count[arr[i]]++;
		
		// 카운트를 누적 카운트 배열로 변경
		for (int i = 1; i < 10001; i++) count[i] += count[i - 1];
		
		// 최소 1번 이상 나오기 때문에 정렬 배열 1부터 시작 -> 크기는 n+1
		int sort[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			sort[count[arr[i]]] = arr[i];
			count[arr[i]]--;
		}
		for (int i = 1; i < n + 1; i++) {
			bw.write(sort[i]+"\n");
		}
		bw.close();
	}
}
