
package day25_CustomMethods_Overloading;

/*
import utilities.ArraysUtility;
 */


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] a = new int[size];
        int i = 0;
        while (i < size) {
            a[i++] = input.nextInt();
        }

        method8(a);

    }

    public static void method8(int[] arr) {
        for (int n : arr) {
            if (n % 4 == 0) {
                continue;

            }
            System.out.print(n);

        }
    }
}
 /*       method3(50);
    }
    public static void method3(int num) {

        if (num<0) {
            return "Less than 0";
        } else if (num<50) {
            return "Less than 50";
        } else if (num<100) {
            return"Less than 100";
        }else {
            return"other";


 */
      /*
        boolean check = true;
        if (str.isEmpty()) {
            check = false;
        }
        if (!str.contains("a")) {
            check = false;
        } else if (str.contains("z")) {
            check = false;
            check = str.substring(0, 1).equals("a") ? check : false;
            return check;
        }
        public static void main (String[] args){
            System.out.print(method5("apple"));


       */


        /*
        String str = "Java Programming Language";

       StringUtility.printEachChar(str);

        System.out.println("--------------------------------");

        String s1 = "Cydeo School";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("-----------------------------------------");

        String word = "Java";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("-----------------------------------------");

        String s2 = "aaaaabbbbbbccccddddd";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);


 */





