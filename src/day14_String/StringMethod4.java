package day14_String;

import java.util.Scanner;

public class StringMethod4 {

    public static void main(String[] args) {
/*
        String str = "Cydeo";

        String str2 = str.repeat(4); //"CydeoCydeoCydeoCydeo"

        System.out.println(str2);
        */

/*
        String s1 = "Wooden Spoon "; //Wooden SpoonWooden Spoon
        String s2 = s1.repeat(100);

        System.out.println(s2);
        */

/*
        System.out.println("------------------------------------------");

        System.out.println( "FADY\n".repeat(15) );

        System.out.println("-------------------------");


        String name = "Java";

        //  System.out.println(  name.repeat(5));


        System.out.println( (name +" ").repeat(5)   );
  */
 Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        for (int i=0;i<word.length();i++){
            System.out.println(word.charAt(i)+"");

       /* Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW


        int charValue = word.length();

        if(charValue >= 3){

            int middleIndex = charValue/2;

            if(charValue %2 == 1){

                System.out.println(word.charAt(middleIndex));

            }else{
                System.out.println(word.substring(middleIndex-1, middleIndex+1));
            }

        */

        }

    }
}







