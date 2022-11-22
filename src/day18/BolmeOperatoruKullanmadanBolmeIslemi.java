package day18;

import java.util.Scanner;

public class BolmeOperatoruKullanmadanBolmeIslemi {
    /*
Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bolme isleminde kullanmak uzere bir bolunen sayi giriniz : ");
        int bolunenSayi = scan.nextInt();
        System.out.print("Bolme isleminde kullanmak uzere bir bolen sayi giriniz : " );
        int bolenSayi = scan.nextInt();
        System.out.print("Bolme islemi sonucu : ");
        System.out.print(bolmeOperatoruKullanmadanBolmeIslemiYapma(bolunenSayi, bolenSayi));

    }public static int bolmeOperatoruKullanmadanBolmeIslemiYapma(int bolunenSayi,int bolenSayi){
        int bolum = 0;
        while (bolenSayi<=bolunenSayi){
            bolunenSayi -= bolenSayi;
            bolum++;
        }
        return bolum;
    }
}
