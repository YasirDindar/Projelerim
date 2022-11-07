package day04;

import java.util.Scanner;

public class IfElseIf_CinsiyeteGoreEmekliOlma {
    public static void main(String[] args) {
        /*
        Soru-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak
        “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir”
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
            char cinsiyet = scan.next().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet=='E' && yas>=65){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet == 'E' && yas >15 && yas < 65) {//15 yasindan kucukler calisamazlar.
            System.out.println("Emekli olman icin " + (65-yas) + " yil daha calisman gerekiyor");
        } else if (cinsiyet == 'K' && yas>=60) {
            System.out.println("Emekli olabilirsin");
        }else if (cinsiyet == 'K' && yas>15 && yas<65){
            System.out.println("Emekli olman icin " + (60-yas) + " yil daha calisman gerekiyor");
        }else {
            System.out.println("Gecersiz giris");
        }
    }
}
