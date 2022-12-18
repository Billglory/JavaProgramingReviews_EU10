package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise {
    public static void  main(String[] args) {

        String[]countries = {"Japan", "Korea", "Turkey", "United Kingdom", "Canada"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length() >=10 );
        countries =list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));


     }
}
