package Lv6_function;


// Q15596
// ���� n���� ���� ���ϴ� �Լ� �ۼ�
public class SumOfN {

	long sum(int[] a){
		long ans=0;
		for(int i =0;i<a.length;i++){
			ans += a[i];
		}
		return ans;
		
	}

}
