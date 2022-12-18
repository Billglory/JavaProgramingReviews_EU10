package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(nums); //hashcode
        System.out.println(Arrays.toString(nums)); // {1,2,3,4,5}

        System.out.println(nums[0]); //1

        /*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());
         */

        int[] scores = {95, 100, 55, 65, 85,78};
        System.out.println(Arrays.toString(scores));// 95, 100, 55, 65, 85,78


        Arrays.sort(scores); //55,65...
        System.out.println(Arrays.toString(scores));

        System.out.println("Min scores"+ scores[0]); //Min scores55
        System.out.println("Min scores"+ scores[scores.length-1]); //Min scores100


        String[] names ={ "Gunay", "Anna","Zuhal", "Ahmet","Maris","Sinema"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));//[Ahmet, Anna, Gunay, Maris, Sinema, Zuhal]

        String[] words ={ "Anna","ANNA",};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); //[ANNA, Anna]
    }
}
