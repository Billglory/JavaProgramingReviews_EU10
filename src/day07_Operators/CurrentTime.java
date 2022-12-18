package day07_Operators;

import java.time.LocalDateTime;

public class CurrentTime {
    public static void main(String[] args) {


        LocalDateTime today = LocalDateTime.now();
        int hour = today.getHour();
        int minute = today.getMinute();
        int second = today.getSecond();
        System.out.println("today = " + today);
        System.out.println(hour+ ":"+ minute+ ":"+second);


    }
}
