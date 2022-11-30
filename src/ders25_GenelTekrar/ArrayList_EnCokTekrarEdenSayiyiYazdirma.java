package ders25_GenelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_EnCokTekrarEdenSayiyiYazdirma {
    public static void main(String[] args) {
        /*
        * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         */
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen oluşturmak istediğiniz list'in uzunluğunu giriniz.");
            int uzunluk = scan.nextInt(); //5
            List<Integer> sayilar = new ArrayList<>(); // boş liste olusturdum
            for (int i = 0; i < uzunluk; i++) // Girilen uzunluk kadar dönecek.
            {
                System.out.println("Lütfen yeni bir değer giriniz. ");
                int girilensayi = scan.nextInt();
                sayilar.add(girilensayi);
            }
            System.out.println("Oluşturulan liste = " + sayilar);
            TekrarliSayilariBul(sayilar);
        }
        public static void TekrarliSayilariBul(List<Integer> sayilar) {
            List<Integer> tekrarliListe = new ArrayList<>();//tum sayilar eklenecek liste
            List<Integer> tekrarsizListe = new ArrayList<>();//sadece tekrar eden lisyete eklenecek
            // sayilar = 1,2,2,3,4
            for (int sayi : sayilar) {
                if (!tekrarliListe.contains(sayi)) // tüm sayilar eklenecek.
                {
                    tekrarliListe.add(sayi);
                } else {
                    tekrarsizListe.add(sayi);
                }
            }
            System.out.println("En cok Tekrar Eden sayi : "+tekrarsizListe);
    }
}
