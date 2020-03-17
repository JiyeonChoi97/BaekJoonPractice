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

		// String���� �Է��ؼ� �ѱ��ھ� char���·�
		for(int i = 0; i < n; i++) {
			array[i] = sc.next();
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = array[i].charAt(j);
			}
		}

        int min_b = 999, min_w = 999, min_result = 0; // �� ��¤�� �ּҰ� ����
        
        // (0,0)�� �ִ� ���� ���϶��� �ּҰ�
        for(int i = 0; i <= n - 8; i++) { // 8*8�� �ڸ�
            for(int j = 0; j <= m - 8; j++) { // 8*8�� �ڸ�
                count = 0;
                for(int x = i; x < i + 8; x++) {
                    for(int y = j; y < j + 8; y++) {
                        if((x+y)%2==0) { // (0,0)�� ���϶� �ε���x,y�� �Ѵ� ¦���̰ų� Ȧ���϶��� ���̾���� �׷��� ������ ī��Ʈ
                            if(arr[x][y] != 'B')
                                count++;
                            continue;
                        }
                        else { // (0,0)�� ���϶� �ε���x,y�� �Ѱ��� ¦�� �Ѱ��� Ȧ�� �϶��� ȭ��Ʈ�̾���� �׷��� ������ ī��Ʈ
                            if(arr[x][y] != 'W')
                            	count++;
                            continue;
                        }
                    }
                }
                if(min_b > count)
                    min_b = count; // (0,0)�� ���̶�� �����Ͽ� �ּҰ� ����
            }
        }
        
        // (0,0)�� �ִ� ���� ȭ��Ʈ �϶��� �ּҰ�
        for(int i = 0; i <= n - 8; i++) { // 8*8�� �ڸ�
            for(int j = 0; j <= m - 8; j++) { // 8*8�� �ڸ�
            	 count = 0; 
                for(int x = i; x < i + 8; x++) {
                    for(int y = j; y < j + 8; y++) {
                        if((x+y)%2==0) { // (0,0)�� ȭ��Ʈ�϶� �ε���x,y�� �Ѵ� ¦���̰ų� Ȧ���϶��� ȭ��Ʈ�̾���� �׷��� ������ ī��Ʈ
                            if(arr[x][y] != 'W')
                            	count++;
                            continue;
                        }
                        else { // (0,0)�� ȭ��Ʈ�϶� �ε���x,y�� �Ѱ��� ¦�� �Ѱ��� Ȧ�� �϶��� ���̾���� �׷��� ������ ī��Ʈ
                            if(arr[x][y] != 'B')
                            	count++;
                            continue;
                        }
                    }
                }
                if(min_w > count) {
                    min_w = count; // (0,0)�� ȭ��Ʈ��� �����Ͽ� �ּҰ� ����
                }
            }
        }
        
        min_result = (min_b < min_w) ? min_b:min_w; // (0,0)���϶��� �ּҰ��� ȭ��Ʈ�϶��� �ּҰ��� ���ؼ� �� �� �� ���� ���� ����
        System.out.println(min_result);

	}

}
