//Write a java programe to find prime factor of a given integer.


import java.util.Scanner;

public class prime_factor {
   public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ::");
      int number = sc.nextInt();

      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
   }
}
