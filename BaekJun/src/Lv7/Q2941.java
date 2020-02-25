package Lv7;
import java.util.Scanner;

//크로아티아 알파벳

public class Q2941 {

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   String word = sc.next();

   String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
   
   for(int i=0;i<croatia.length;i++) {
      word = word.replace(croatia[i], "a");
   }
   
   System.out.println(word.length());
   

}

}