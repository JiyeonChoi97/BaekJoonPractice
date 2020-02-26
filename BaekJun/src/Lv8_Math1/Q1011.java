package Lv8_Math1;
import java.util.Scanner;

//Fly me to the Alpha centauri 

public class Q1011 {

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   long t = sc.nextInt();
   
   for(long i=0;i<t;i++) {
      long x = sc.nextInt();
      long y = sc.nextInt();
      long length = y-x;
      
      for(long j=1;j<=length;j++) {
         if(length==1) {
            System.out.println(1);
            break;
         }
         if(length>=j*j-(j-1)&&length<(j+1)*(j+1)-j) {
            if(length<=j*j) {
               System.out.println(j*2-1);
               break;
            } else {
               System.out.println(j*2);
               break;
            }
         }
      }
      
      
   }
}

}