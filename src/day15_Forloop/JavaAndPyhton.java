package day15_Forloop;

import java.util.Scanner;

public class JavaAndPyhton {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();

    //WRITE YOUR CODE BELOW


    int java = 0;
    int python = 0;

    while(true)

    {
        if (!sentence.contains("java")) {
            break;
        } else {
            java++;
            sentence = sentence.replaceFirst("java", "");
        }

    }

    while(true)

    {
        if (!sentence.contains("python")) {
            break;
        } else {
            python++;
            sentence = sentence.replaceFirst("python", "");
        }
    }



    if(java==python)

    {
        System.out.println(true);
    }else

    {
        System.out.println(false);
    }
}
}


