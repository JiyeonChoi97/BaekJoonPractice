package Lv8_Math1;

import java.util.Scanner;

//ACM 호텔
//정문과 가까운 방 배정하기
public class Q10250 {

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   int t = sc.nextInt();
   
   for(int i=0;i<t;i++) {
      int h = sc.nextInt();
      int w = sc.nextInt();
      int n = sc.nextInt(); // n번쨰 손님
      int count=0;
      
      for(int j=1;j<=w;j++) {
         for(int k=1;k<=h;k++) {
            count++;
            if(count == n) {
               System.out.print(k);
               if(j<10) System.out.print("0");
               System.out.print(j+"\n");
               break;
            }
         }
      }
   }
}

}