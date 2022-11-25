package day10_MethodOlusturma;

import java.util.Scanner;

public class MethodOlusturmaToplama {
    public static void main(String[] args) {
        //Kullanıcıdan 2 sayi alip bunların toplamini yazdiran bir method olusturun.

        isteToplaYazdir();
    }

    public static void isteToplaYazdir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("İki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("Girilen sayilarin toplami : " +(sayi1+sayi2));
    }
}
