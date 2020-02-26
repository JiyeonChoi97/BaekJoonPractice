package Lv9_Math2;

import java.util.Scanner;

//소수 찾기

public class Q1978 {

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   
   int t = sc.nextInt();
   int count = 0;
   
   for(int i=0;i<t;i++) {
      int n = sc.nextInt();
      if(n==2) count++;
      for(int j=2;j<n;j++) {
         if(n%j==0) break;
         if(j==n-1) count++;
      }
   }
   System.out.println(count);
}

}