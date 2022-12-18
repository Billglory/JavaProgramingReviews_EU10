package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
/*
        String str= "Wooden Spoon";
                    // 01234567891011  harf
        String result = "";    // contain the reversed version of str  ters çevrilmiş sürümünü içerir

    /*     result += str.charAt(11); //n
        result += str.charAt(10);//o
        result += str.charAt(9); //o
        result += str.charAt(8); //p
        result += str.charAt(7); //S
        result += str.charAt(6); //' ' boşluk
        result += str.charAt(5); //n
        result += str.charAt(4); //e
        result += str.charAt(3); //d
        result += str.charAt(2); //o
        result += str.charAt(1); //o
        result += str.charAt(0); //W

        System.out.println(result);

         */
/*
        for (int i= str.length()-1; i>=0; i-- ) {
         result += str.charAt(i);
        }
        System.out.println(result);
        }

 */
/*

        String str = "I love Java, Java is fun programming language";
        //index:      012345678

        String result = "";  // contain the reversed version of str str nin ters versiyonu

        for (int i= str.length()-1; i>=0; i-- ) {  //str dizin no su. 0 dan başlar
         result += str.charAt(i); // sonuca her karakte eklenir
        }
        System.out.println(result);
        }
     */
        String str = "Ey Edip Adanada Pide Ye";
        //index:      012345678

        String result = "";  // contain the reversed version of str str nin ters versiyonu

        for (int i= str.length()-1; i>=0; i-- ) {  //str dizin no su. 0 dan başlar
            result += str.charAt(i); // sonuca her karakte eklenir
        }
        System.out.println(result);
    }

/*
        result += str.charAt(8); //a
        result += str.charAt(6); //a
        result += str.charAt(16); //a
        result += str.charAt(17); //a
        result += str.charAt(19); //a
        result += str.charAt(20); //a


        System.out.println(result);

 */
        /*
        result += str.charAt(11); //n
        result += str.charAt(10); //o
        result += str.charAt(9); //o
        result += str.charAt(8); //p
        result += str.charAt(7); //S
        result += str.charAt(6); //' '
        result += str.charAt(5); //n
        result += str.charAt(4); //e
        result += str.charAt(3); //d
        result += str.charAt(2); //o
        result += str.charAt(1); //o
        result += str.charAt(0); //W
*/
/*
        for (int i = str.length() - 1; i >= 0; i--) { //i: index numbers of str (starting last index to index 0 )
            result += str.charAt(i); // adding each character to result
        }

        //
        System.out.println(result);
*/
    }


/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon
				output:
					noopS nedooW
 */

