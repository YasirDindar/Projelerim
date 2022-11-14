package day11;

import java.util.Scanner;

public class MethodOlusturmaAsalSayi {
    public static void main(String[] args) {
    /*
    Soru-Kullanicidan main method icinde pozitif bir tamsayi alin.
    Girilen sayinin asal sayi olup olmadigini kontrol edip,
    sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(asalSayiKontrolu(sayi));

    }
    public static String asalSayiKontrolu(int sayi) {
        String sonuc = "";
        for (int i = 2; i <= sayi - 1; i++) {
            if (sayi % i == 0) {
                sonuc = "Asal degil";
                break;
            }
        }
        if (!(sonuc.equals("Asal degil"))) {
            sonuc = "Asal";
        }
            return sonuc;
    }
}
