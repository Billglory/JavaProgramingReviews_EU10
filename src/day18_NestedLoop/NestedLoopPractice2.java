package day18_NestedLoop;

import java.util.Arrays;
import java.util.Scanner;

public class NestedLoopPractice2 {
    public static void main(String[] args) {
/*
        for (int j = 0; j < 10; j++) { //j = 0, 1, 2

            for (int i = 0; i < 10; i++) {
                System.out.print("|| * ");
            }

            System.out.println();

        }



 */

//Write a program to print following pattern:
//outer loop should iterates: 6 times
   /*
1
12
123
1234
12345
123456
   */
//Q7--------------------------
        /*
        for (int i = 5; i <= 6; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

         */

        String z="popcorn";
        z =z.substring(1,8);

        if (z.equals("opcor")) {
            System.out.print(z.length());
        }else {
            System.out.print(z.replace("o,", "a"));
        }


/*
      Scanner input=new Scanner(System.in);
      int num1= input.nextInt();
      int num2= input.nextInt();
      int iterate = input.nextInt();
      int total=0;

      for (int j=0;  j < iterate; j++) {
          if( j % 3 == 0) continue;
          total += num1 + num2;
      }
        System.out.println(total);


 */

        /*
        int[] nums = {14, 1, 84, 97, 1243, 46};

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                total += 3;

            } else {
                total += 10;

            }
            if (i % 3 == 0) {
                total -= 15;

            }
        }
        System.out.println(total);
        */
        /*
          String str= "The whole time it was raining";
          do {
              System.out.print(str.charAt(0));
              str= str.substring(3);

          }while (!str.isEmpty());
          */


    }
}









     /*
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


      */
/*
1. Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */


