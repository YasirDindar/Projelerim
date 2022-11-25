package day04_IfElseStatements;

import java.util.Scanner;

public class NestedIfElse_EmekliOlma {
    public static void main(String[] args) {
        /*
        Soru- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak
        “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        //Ana degiskenimiz cinsiyet olsun.Buyuk-kucuk harf kuralina uyalim.

        if (cinsiyet == 'E' || cinsiyet == 'e') {
            if (yas < 15) {
                System.out.println("Gecersiz yas girisi");
            } else if (yas < 65) {
                System.out.println("Emekli olman icin " + (65 - yas) + " sene daha calisman gerekiyor");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet == 'K' || cinsiyet == 'k') {
            if (yas < 15) {
                System.out.println("Gecersiz yas girisi");
            } else if (yas < 60) {
                System.out.println("Emekli olman icin " + (60 - yas) + " sene daha calisman gerekiyor");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        }else {
            System.out.println("Gecersiz cinsiyet girisi");
        }
    }
}