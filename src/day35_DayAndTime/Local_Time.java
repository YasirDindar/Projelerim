package day35_DayAndTime;

import java.time.LocalTime;

public class Local_Time {
    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();
        System.out.println(saat);//11:18:37.842962700

        LocalTime saat2 = LocalTime.of(11,10,20);
        System.out.println(saat.compareTo(saat2));//1

        System.out.println(saat2.withNano(84520));//11:10:20.000084520
    }
}
