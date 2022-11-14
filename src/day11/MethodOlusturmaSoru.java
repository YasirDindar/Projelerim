package day11;

import java.util.Scanner;

public class MethodOlusturmaSoru {
    /*
    Soru-Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
    input : isim : Ali        soyisim :YILMAZ.    output : Ali Yilmaz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Soyadinizi giriniz");
        String soyad = scan.nextLine();

        System.out.println(isimSoyisimDuzenle(isim,soyad));
    }
    public static String isimSoyisimDuzenle(String isim,String soyad){
        String yenisimSoyisim = isim.substring(0,1).toLowerCase()+
                                isim.substring(1).toLowerCase()+
                                " "+
                                soyad.substring(0,1).toUpperCase()+
                                soyad.substring(1).toLowerCase();

    return yenisimSoyisim;
    }
}
