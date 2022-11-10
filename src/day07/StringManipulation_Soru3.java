package day07;

import java.util.Scanner;

public class StringManipulation_Soru3 {
    public static void main(String[] args) {
        /*
        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        -ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        -eşit veya soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Soyadinizi giriniz");
        String soyad = scan.nextLine();
        String yeniIsimSoyisim ;
        if (isim.length()>soyad.length()){
            yeniIsimSoyisim= isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " "+
                            soyad.substring(0,1).toUpperCase()+
                            soyad.substring(1).toLowerCase();
            System.out.println(yeniIsimSoyisim);
        }else {
            yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " "+
                    soyad.toUpperCase();
            System.out.println(yeniIsimSoyisim);
        }
    }
}
