package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthlargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n=3;
        for (int i=1; i<n; i++){
            list.removeIf(p -> Collections.max(list) ==p);
        }
        /*
        list.removeIf(p -> Collections.max(list) ==p);
        list.removeIf(p -> Collections.max(list) ==p);
         */
        int max= Collections.max(list);

        System.out.println(max);

    }
}
//int 4 verince
//Pardon
//int 5 olunca
//4 kere işlem yapiyor
//Yaptiği işlem
//List den en buyuk olan rakami ayiriyor
//Haliyle 8 , 7 , 6 ve 5 leri siliyor
//En buyuk olani yazdiriyosun
//Geri 4 kaliyor
//Eger n i 3 verirsen
//2 kere işlem yapacak
//Birinci dongude 8 ikinci dongude 7 gidicek
//Geri en buyuk 6 kalacak