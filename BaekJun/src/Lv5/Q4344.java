package Lv5;
// ��ձ��ϱ�
// ����� �Ѵ� �л����� �ۼ�Ʈ�� �ݿø��Ͽ� �Ҽ��� ���� �ڸ����� ���

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
			int sum=0, count=0;
			int arr[] = new int[arr_n];
			for(int j = 0;j<arr_n;j++){
				do{
					arr[j] = sc.nextInt();
				}while(n<0||n>100);
				sum+=arr[j];
				if(j==arr_n-1){
					double avg = (double)sum/arr_n;
					for(int k=0;k<arr_n;k++){
						if(arr[k]> avg){
							count++;
						}
					}
				}
			}
			System.out.printf("%.03f", ((float)count/arr_n)*100);
			System.out.println("%");
		}
	}
}
