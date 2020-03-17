package Lv11_BruteForce;

import java.util.Scanner;

public class Q1018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count;

		String[] array = new String[n]; 
		char[][] arr = new char[n][m];

		// String으로 입력해서 한글자씩 char형태로
		for(int i = 0; i < n; i++) {
			array[i] = sc.next();
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = array[i].charAt(j);
			}
		}

        int min_b = 999, min_w = 999, min_result = 0; // 다 뒤짚고 최소값 저장
        
        // (0,0)에 있는 돌이 블랙일때의 최소값
        for(int i = 0; i <= n - 8; i++) { // 8*8로 자름
            for(int j = 0; j <= m - 8; j++) { // 8*8로 자름
                count = 0;
                for(int x = i; x < i + 8; x++) {
                    for(int y = j; y < j + 8; y++) {
                        if((x+y)%2==0) { // (0,0)이 블랙일때 인덱스x,y가 둘다 짝수이거나 홀수일때는 블랙이어야함 그렇지 않으면 카운트
                            if(arr[x][y] != 'B')
                                count++;
                            continue;
                        }
                        else { // (0,0)이 블랙일때 인덱스x,y가 한개는 짝수 한개는 홀수 일때는 화이트이어야함 그렇지 않으면 카운트
                            if(arr[x][y] != 'W')
                            	count++;
                            continue;
                        }
                    }
                }
                if(min_b > count)
                    min_b = count; // (0,0)이 블랙이라는 가정하에 최소값 저장
            }
        }
        
        // (0,0)에 있는 돌이 화이트 일때의 최소값
        for(int i = 0; i <= n - 8; i++) { // 8*8로 자름
            for(int j = 0; j <= m - 8; j++) { // 8*8로 자름
            	 count = 0; 
                for(int x = i; x < i + 8; x++) {
                    for(int y = j; y < j + 8; y++) {
                        if((x+y)%2==0) { // (0,0)이 화이트일때 인덱스x,y가 둘다 짝수이거나 홀수일때는 화이트이어야함 그렇지 않으면 카운트
                            if(arr[x][y] != 'W')
                            	count++;
                            continue;
                        }
                        else { // (0,0)이 화이트일때 인덱스x,y가 한개는 짝수 한개는 홀수 일때는 블랙이어야함 그렇지 않으면 카운트
                            if(arr[x][y] != 'B')
                            	count++;
                            continue;
                        }
                    }
                }
                if(min_w > count) {
                    min_w = count; // (0,0)이 화이트라는 가정하에 최소값 저장
                }
            }
        }
        
        min_result = (min_b < min_w) ? min_b:min_w; // (0,0)블랙일때의 최소값과 화이트일때의 최소값을 비교해서 둘 중 더 작은 값을 저장
        System.out.println(min_result);

	}

}
