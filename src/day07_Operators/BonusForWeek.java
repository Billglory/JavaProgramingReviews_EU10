package day07_Operators;

import java.time.LocalDateTime;

public class BonusForWeek {


        public static void main(String[] args) {
            // hour:minutes:seconds
            LocalDateTime today = LocalDateTime.now();
            System.out.println("today = " + today);

            int hour = today.getHour();
            System.out.println("hour = " + hour);

            int minute = today.getMinute();
            System.out.println("minute = " + minute);

            int second = today.getSecond();
            System.out.println("second = " + second);

            System.out.println(hour + " : " + minute + " : " + second);


        }
    }


