package day10_nestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {

        /*
        char ch ='@';

        if(ch >= '0' && ch <= '9') {
                System.out.println("Digit");

            }else if( (ch >= 'A' && ch <= 'Z')  || (ch >='a'  && ch <= 'z')  ) {
                System.out.println("Alphabetic");
            }else {
                System.out.println("Special character");
            }

}
}
*/
        /*
        char ch ='d';

        if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");

        }else if( (ch >= 'A' && ch <= 'Z')  || (ch >='a'  && ch <= 'z')  )
            System.out.println("Alphabetic");
        else            System.out.println("Special character");
        }
        }
        */


/*
  char ch ='e';

        if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");

        }else if( (ch >= 'A' && ch <= 'Z')  || (ch >='a'  && ch <= 'z')  )
            System.out.println("Alphabetic");
        else            System.out.println("Special character");
        }
        }
        */


        char ch = 65;

        if (ch >= 48 && ch <= 57) {
            System.out.println("Digit");
        } else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            System.out.println("Alphabetic");
        } else {
            System.out.println("Special character");
        }


    }
}

