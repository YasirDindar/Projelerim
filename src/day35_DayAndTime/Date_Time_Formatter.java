package day35_DayAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date_Time_Formatter {
    /*
     format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini

         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar
     */

    public static void main(String[] args) {
        LocalDateTime zaman =  LocalDateTime.now();
        System.out.println(zaman);//2022-12-12T11:32:03.706973400

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(zaman.format(dtf1));//12/12/2022

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d:MMM:YY");
        System.out.println(zaman.format(dtf2));//12:Ara:22

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("d/MMMM/YYY EEEE");
        System.out.println(zaman.format(dtf3));//12/Aralık/2022 Pazartesi

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(zaman.format(dtf4));//11:38 ÖÖ

        DateTimeFormatter dtf5= DateTimeFormatter.ofPattern("HH:MM");
        System.out.println(zaman.format(dtf5));//11:12
    }
}
