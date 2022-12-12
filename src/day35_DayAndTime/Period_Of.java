package day35_DayAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Period_Of {
    public static void main(String[] args) {
        //dogumunuzdan bugune kadar ne kadar zaman gecti ?
        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1995,3,13);

        Period gecenSure = Period.between(dogumGunu,bugun);

        System.out.println(gecenSure);//P27Y8M29D   27 yil 8 ay 29 gun
        System.out.println(gecenSure.getYears());//27
    }
}
