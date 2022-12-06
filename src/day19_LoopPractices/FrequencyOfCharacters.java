package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
/*
        String str = "aabcccd";
        char ch = str.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (ch == each){

                count++;
            }
        }
        System.out.println(count);
    }
}

    String str = "aabcccdaaaa";
    char ch = str.charAt(0);
    int count = 0;

        for (int i = 0; i < str.length(); i++) {
        char each = str.charAt(i);
        if (ch == each){

        count++;
        }
        }
        System.out.println(count);
        }
        }
*/
        /*
        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {

                    count++;
                }
            }
            result += ch;
            result += count;
        }
        System.out.println(result);
    }
}
*/
        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {

                    count++;
                }
            }

            if (result.contains(""+ch)){
                continue;
            }
            result += ch;
            result += count;
        }

        System.out.println(result);
    }
}

/*
        char ch = str.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (ch == each){

                count++;
            }
        }
        System.out.println(count);
    }
}

 /*

        String str = "aacccbbbbbbcccd";
        String result = ""; //a2b1c3d1


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;
        }


        System.out.println(result);








    }

}
}
  */
/*
1. Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */
/*
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str= scan.nextLine().toLowerCase();
        String result=" ";


        for (int j = 0; j <str.length() ; j++) {

            char ch=str.charAt(j);//each character from str
            int count=0;

            for (int i = 0; i < str.length(); i++) {// finds the frequency of the cahracter
                char each= str.charAt(i);
                if (ch==each){
                    count++;
                }
            }
            if(result.contains(""+ch)){
                continue;

            }

            result+=ch;
            result+=count;

        }

        System.out.println(result);

    }
}
*/
