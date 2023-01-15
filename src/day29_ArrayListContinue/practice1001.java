package day29_ArrayListContinue;

public class practice1001 {

    public static void main(String[] args) {


        String str= "Ey Edip Adanada Pide Ye";
        String result="";


        for(int i=str.length()-1; i>=0; i--){
            char va= str.charAt(i);
            result +=va;



        }

        System.out.println(result);
        boolean isPalindrome=  result.equalsIgnoreCase(str);


    /*
        if (result.equalsIgnoreCase(str)) {

            isPalindrome = true;
        }else {

            isPalindrome=false;

        }*/

        System.out.println("isPalindrome = " + isPalindrome);

    }


}
