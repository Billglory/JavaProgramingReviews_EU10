package day11_Switch_Statement;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");

        int num1 = input.nextInt();

        System.out.println(num1);

    }
} // result = Enter an integer
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");

        int num1 = input.nextInt();

        System.out.println("Enter an decimal");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication:" + (num1 * num2));

    }
} // result = Eligible


/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");

        int num1 = input.nextInt();

        System.out.println("Enter an decimal");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication:" + (num1 * num2));

        input.close();

        System.out.println("Enter an integer");
        int num3 = input.nextInt();
        System.out.println(num3);

    }
} //result = Eligible
*/
