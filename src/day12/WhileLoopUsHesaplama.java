package day12;

import java.util.Scanner;

public class WhileLoopUsHesaplama {
    public static void main(String[] args) {
        /*
       Soru-Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
       While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Tamsayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("Hesaplamak istedginiz ussu giriniz");
        int us = scan.nextInt();

        usHesaplama(sayi,us);
    }
    public static void usHesaplama(int sayi,int us){
        int sonuc =1;
        while (us>0){
            sonuc *=sayi;
            us--;
        }
        System.out.println(sonuc);
    }
}
