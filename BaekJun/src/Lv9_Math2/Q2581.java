package Lv9_Math2;

//소수
//M이상 N 이하의 자연수 중 소수의 합과 최솟값 출력
import java.util.ArrayList;
import java.util.Scanner;

public class Q2581 {

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   int m = sc.nextInt();
   int n = sc.nextInt();
   int sum = 0;
   ArrayList arr = new ArrayList();
   for(int j = m; j<=n;j++) {
      if(j==1&&n==1) break;
      if(j==2) {
         sum+=2;
         arr.add(j);
      }
      for(int i=2;i<j;i++) {
         if(j%i==0) break;
         if(i==j-1) {
            sum+=j;
            arr.add(j);
         }
      }
   }
   if(sum==0) sum=-1;
   System.out.println(sum);
   if(!(arr.isEmpty())) System.out.println(arr.get(0));
}

}