package day15_Forloop;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you browser name:");
        String browserType = scanner.nextLine();

        switch (browserType){
            case "firefox":
                System.out.println("firefox is being set up");
                break;
            case "chrome":
                System.out.println("chrome is being set up");
                break;
            case "edge":
                System.out.println("edge is being set up");
                break;
            default:
                System.out.println("please enter a valid browser name");
        }
*/
/*

        int orderNum = 120;

        switch (orderNum) {
            case 119:
                System.out.println("order 119 is ready");
                break;
            case 120:
                System.out.println("order 120 is ready");
                break;
            case 121:
                System.out.println("order 121 is ready");
                break;
            default:
                System.out.println("Please wait for your order");
        }
        int a = 1, b = 2;
        System.out.println((a++ - --b) > (++a - b++)); // false
        */
/*
        int a = 10;
        double b = (double) a;

        double c = 100;
        int d = (int)c;
        System.out.println(d);

 */
        /*
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Addition: " + (num1 + num2));

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) { // if the answer is invalid
                System.err.println("Invalid Entry, Please re enter");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")) {
                break; // exits the outer loop
            }
        }

         */
        /*
        int a = 50; //a =30-7=23-7=16 -7 =9 - 7 = 2
        int b = 9;

        int count = 0; // count = 1+1=2+1 = 3+1 =4

        while (a >= b) {
            a -= b;
            count++;
        }


        System.out.println(count+" with a remainder of "+a);

         */
    }
}

