package day35_DayAndTime;

import java.time.LocalDateTime;

public class Local_Date_Time {
    public static void main(String[] args) {
        LocalDateTime zaman = LocalDateTime.now();

        System.out.println(zaman);//2022-12-12T11:23:24.103003600

        System.out.println(zaman.getDayOfYear());//346
    }
}
