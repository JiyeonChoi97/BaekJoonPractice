package Lv8_Math1;

//손익분기점

import java.util.Scanner;

public class Q1712 {

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   int num=0, sum=a, sumC=0;
   boolean check = true;
   
   if(b>=c) {
      num=-1;
      check=false;
   } else {
      num = a / (c-b) + 1;
   }
   
   System.out.println(num);
}

}