package day18;

import java.util.Scanner;

public class EnBuyukSayiyiBulma {
    // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("5 adet sayi giriniz");
        double enBuyukSayi = 0;
        int sayac = 0;

        while (sayac<5){
            double sayi = scan.nextDouble();
            if (sayi>enBuyukSayi){
                enBuyukSayi = sayi;
            }
            sayac++;
        }
        System.out.println("enBuyukSayi = " + enBuyukSayi);
    }
}
