package Lv7;
//단어의 개수 

import java.util.Scanner;

public class Q1152 {

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();

   int count = 0;
   
   String[] word = str.split(" ");
   
   for(int i =0; i<word.length;i++) {
      count++;
      if(word[i].isEmpty()) count -= 1;
   }
   
   System.out.println(count);
}

}