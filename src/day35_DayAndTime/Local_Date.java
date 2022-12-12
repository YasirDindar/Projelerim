package day35_DayAndTime;

import java.time.LocalDate;

public class Local_Date {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.minusDays(100));//100 gun onceki tarihi yazdirir
        System.out.println(tarih.minusWeeks(6).minusDays(5));//6 hafta 5 gun onceyi yazdirir

        System.out.println(tarih.plusMonths(5).
                                 plusWeeks(2).
                                 plusDays(3));//5 ay 2 hafta 3 gun sonraki tarihi yazdirir

        System.out.println(tarih.getMonthValue());//bulundugumuz ayin kacinci ay oldugunu belirtir.  aralik ayi=12
        System.out.println(tarih.getMonth());//bulundugumuz ayi yazdirir. DECEMBER
        System.out.println(tarih.getDayOfWeek());//bulundugumuz gunu yazdirir.  MONDAY
        System.out.println(tarih.getDayOfYear());//yilin kacinci gunu oldugunu yazdirir.  346

        System.out.println(tarih.isLeapYear());//bulundugumuz yil artik yil mi ? false
        System.out.println(tarih.withYear(2000).isLeapYear());//2000 yili artik yil mi? true
        System.out.println(tarih.withYear(2005).withMonth(10).withDayOfMonth(18));//dilegimiz tarihe gidebiliriz  2005-10-18

        System.out.println(tarih.lengthOfYear());//bulundugumuz yilin kac gun cektigini yazdirir.   365 gun
        System.out.println(tarih.withYear(2020));//2020 yili 366 gun ceker

        System.out.println(tarih.withYear(1995).withYear(3).withDayOfMonth(13).getDayOfWeek());
        // belirtilen tarihin hangi gune denk geldigini yazdirir    SATURDAY

        LocalDate date1 = LocalDate.of(2012,12,12);
        LocalDate date2 = LocalDate.of(2011,11,11);
        System.out.println(date2.isBefore(date1));//(2011/2012 den oncedir)true
        System.out.println(date2.isAfter(date1));//(2011/2012 den sonradir)false
        System.out.println(tarih.equals(date1));//false
    }
}
