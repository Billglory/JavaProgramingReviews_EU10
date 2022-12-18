package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);
        int count = 1;

        String sentence = scan.nextLine();

        for(int i = 1; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) == ' ')  {
                if (sentence.charAt(i+1)== ' '){
                    continue;
                }
                count++;

            }
        }
        System.out.println(count);
*/
/*

       String str = "abc";
        boolean bc = false;
        System.out.println("abc = bc  " + (abc && abc));

        /*
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();

        // WRITE YOUR CODE BELOW

        System.out.println("Length is: "+sentence.length());
*/
        /*
        String str1 = "abc";
        String str2 = "bc";
        boolean endsWith = false;

        if(str1.endsWith(str2)){
            endsWith = true;
        }
        System.out.println(endsWith);
*/String str = "acb";
        boolean condition = true;

        for (int i = 0; i <=str.length()-2 ; i++) {
            // char ch = str.charAt(0);
            if((str.charAt(i) >= str.charAt(i+1))){
                condition = false;


            }

        }
        System.out.println(condition);
    }
}



