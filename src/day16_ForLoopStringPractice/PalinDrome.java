package day16_ForLoopStringPractice;

public class PalinDrome {
    public static void main(String[] args) {
/*
        String word = "Java";
   */
        /*
        String word = "Level";
*/
        String word = "Racecar";

        String reversed = "";


       // "Java" ==> "avaJ" ===> //false (not palindrome) Palindrom, tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir.
      //  "Level"; isPalindrome = true
    //  "Racecar  ==>  isPalindrome = true
        for (int i = word.length()-1;  i >=0 ; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);

/*
 */

    }

}



         /*
 "Anna" ==> "annA" ===>true
 "Level"
 "Racecar
 Dad
 Mom
 ....
*/
