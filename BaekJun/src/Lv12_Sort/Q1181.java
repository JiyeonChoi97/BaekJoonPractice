// 단어 정렬
// n개의 단어가 들어오면 
// 1. 길이가 짧은 것부터
// 2. 길이가 같으면 사전 순으로 
package Lv12_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1181 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<String> list = new ArrayList<>();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String text = br.readLine();
			list.add(text);
			for(int j = 0; j < list.size()-1; j++){
				if(text.equals(list.get(j))) list.remove(list.size()-1);
			}
			
		}
		Collections.sort(list);

		for (int j = 1; j <= 50; j++) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).length() == j) {
					bw.write(list.get(i) + "\n");
				}
			}
		}
		bw.close();

	}

}
