package day07_Operators;

public class ConvertMinutesToYearAndDay {
    public static void main(String[] args) {


        int minutes = 2345678;
        int hours = minutes / 60;
        int day = hours / 24;
        int year = day / 365;
        int remainder = day % 365;


        System.out.println(minutes + " minutes is approximately " + year + " years and " + remainder + " days");

    }


}
