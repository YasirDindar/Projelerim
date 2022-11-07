package day04;

import java.util.Scanner;

public class IfElseIf_VucutEndeksiHesaplama {
    public static void main(String[] args) {
        /*
         // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
        double agirlik = scan.nextDouble();

        System.out.println("Lutfen boyunuzu cm cinsinden giriniz");
        double uzunluk = scan.nextDouble();

        double vke = (agirlik*10000) / (uzunluk*uzunluk);

        if (vke>30){
            System.out.println("Obez");
        } else if (vke>25) {
            System.out.println("Kilolu");
        } else if (vke>20) {
            System.out.println("Normal");
        }else if (vke>0){
            System.out.println("Zayif");
        }else {
            System.out.println("Gecersiz giris");
        }
    }
}
