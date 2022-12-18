package day11_Switch_Statement;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        /*
        double n1 = 200.5,
                n2 = 10.5;

        char operator = '+';

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if(valid) { // Operator: +, -, *, /

            switch (operator){

                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '*':
                    System.out.println(n1 * n2);
                    break;

                default:
                    System.out.println(n1 / n2);

            }

        }else{
            System.err.println("Invalid Operator: "+operator);
        }


    }



} //result = 211
*/
        /*
    double n1 = 200.5,
            n2 = 10.5;

    char operator = '-';

    boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if(valid) { // Operator: +, -, *, /

                switch (operator){

                case '+':
                System.out.println(n1 + n2);
                break;

                case '-':
                System.out.println(n1 - n2);
                break;

                case '*':
                System.out.println(n1 * n2);
                break;

default:
        System.out.println(n1 / n2);

        }

        }else{
        System.err.println("Invalid Operator: "+operator);
        }


        }



        } //result = 190
*/

        Scanner scan = new Scanner(System.in);
        boolean isTall = scan.nextBoolean();
        boolean isFast= scan.nextBoolean();
        boolean isFlexible= scan.nextBoolean();
        String sport ="";
        if( isTall){
            if (isFast) {
                sport = "bas";
            }
            else if (isFlexible) {
                sport = "jim";
            }else {
                sport = "wo";
            }

            }else {
            if (isFast) {
                sport = "soccer";
            } else {
                sport = "te";

            }

        }
        System.out.println(sport);

        }


    }




 // result=Invalid Operator: $


/*
Given two double variables n1, n2 and a char variable named operator.
use switch statement to calculate the result of n1 & n2 based on the given operator
		Valid operators are: -, +, *, /
		            @
 */
/*
Footer
        © 2022 GitHub, Inc.
        Footer navigation
        Terms
        Privacy

*/



