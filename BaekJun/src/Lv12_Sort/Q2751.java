// N개의 수를 오름차순으로 정렬2
package Lv12_Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			Collections.sort(list);
			for (int i = 0; i < n; i++) {
				System.out.println(list.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
