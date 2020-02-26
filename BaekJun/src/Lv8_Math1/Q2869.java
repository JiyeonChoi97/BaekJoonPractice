package Lv8_Math1;

import java.util.Scanner;

public class Q2869 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int v = sc.nextInt();
      int count = 0;
      
      v -= b;
      count = v / (a-b);
      
      if(!(v % (a-b)==0)) count ++;
      System.out.println(count);
   }

}