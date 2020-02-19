package Lv6_function;


// Q15596
// 정수 n개의 합을 구하는 함수 작성
public class SumOfN {

	long sum(int[] a){
		long ans=0;
		for(int i =0;i<a.length;i++){
			ans += a[i];
		}
		return ans;
		
	}

}
