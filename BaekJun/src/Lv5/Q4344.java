package Lv5;
// ��ձ��ϱ�
// n���� ����� �Ҽ��� ���� �ڸ����� ���

import java.util.Scanner;

public class Q4344 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		do{
			n = sc.nextInt();
		}while(n<1||n>1000);
		
		for(int i=0;i<n;i++){
			int arr_n = sc.nextInt();
			int sum=0;
			for(int j = 0;j<arr_n;j++){
				int arr[] = new int[arr_n];
				do{
					arr[j] = sc.nextInt();
				}while(n<1||n>100);
				sum+=arr[j];
			}
			double avg = (double)sum/arr_n;
			
			
			System.out.printf("%.03f", avg);
			
		}
	}

}
