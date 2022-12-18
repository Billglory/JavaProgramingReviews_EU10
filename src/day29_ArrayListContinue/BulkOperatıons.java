package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperatıons {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        /*
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        System.out.println("---------------------------------------");

         */

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 3, 3, 3, 3, 5, 5, 5, 5, 8, 8, 8, 8));
        System.out.println(list);
        list.removeAll(Arrays.asList(3, 5, 8));  // hariç yazdır

        System.out.println(list);
        System.out.println("-------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900));
        numbers.retainAll(Arrays.asList(100, 200, 300));   // seçilen rakmalrı yazdır
        System.out.println(numbers);

        System.out.println("-------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));  // tekrar edenler
        System.out.println(jobTitles);

        System.out.println("-------------------------------------------");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 8, 9, 10));
        boolean r1 = nums.contains(10);  // class içşnde olan rakamlar  true/false
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);// class içşnde olan rakamlar
        boolean r3 = nums.containsAll(Arrays.asList(2, 5, 10, 1000));// class içşnde olan rakamlar
        System.out.println("r1" + r1);
        System.out.println("r2" + r2);
        System.out.println("r3" + r3);


        System.out.println("-------------------------------------------");

        String[] names = {"Jash", "Jack", "Daniel", "Shay", "Breanna" };
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));  // kelimeleri direk yazdır
        System.out.println(nameList);

        System.out.println("-------------------------------------------");

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));  //rakamları direk yazdır
        System.out.println(list2);

        System.out.println("-------------------------------------------");

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3" + list3);

    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);

        }
        return list;

    }
}