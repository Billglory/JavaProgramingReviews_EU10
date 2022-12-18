package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeef";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(""))); // ayrı yazma, bölme
        System.out.println("list=" + list);

        System.out.println("-----------------------------------");

        String str2 = "aaabcccdeeegggggggggghiiiiiiiiiiiiiiijkkkkkkkkkkkkk";
        String[] arr = str2.split("");
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr)); // ayrı yazma, bölme
        System.out.println("list2 =" + list2);

        System.out.println("-----------------------------------");

        String unique = "";
        for (String each : list) {
            int frequency = Collections.frequency(list, each); // sıklık, 1 kez tekrar
            if (frequency == 1) {
                unique +=each;
            }
        }
        System.out.println("unique =" + unique);
    }
}