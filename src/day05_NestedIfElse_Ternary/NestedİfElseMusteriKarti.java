package day05_NestedIfElse_Ternary;

import java.util.Scanner;

public class NestedİfElseMusteriKarti {
    /*
    Soru-Kullanicidan aldigi urun adedi ve liste fiyatini alin,
    kullaniciya musteri karti olup olmadigini sorun.
    Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
    Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac urun aldiniz?");
        int urunAdedi = scan.nextInt();

        System.out.println("Urunun liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();
        double toplamFiyat = scan.nextDouble();
        boolean kartVarMi = false;

        //ana degiskenimiz kart olsun;
        if (kartVarMi){
            if (urunAdedi<0){
                System.out.println("Hatali urun girisi");
            } else if (urunAdedi<10) {
                toplamFiyat = urunAdedi*listeFiyati*0.85;
                System.out.println("15 indirimli fiyati : " + toplamFiyat + " TL");
            }else {
                toplamFiyat = urunAdedi*listeFiyati*0.80;
                System.out.println("20 indirimli fiyati : " + toplamFiyat + " TL");
            }
        }else {
            if (urunAdedi<0){
                System.out.println("Hatali urun adei girisi");
            } else if (urunAdedi<10) {
                toplamFiyat = urunAdedi*listeFiyati*0.90;
                System.out.println("10 indirimli fiyati : " + toplamFiyat + " TL");
            }else {
                toplamFiyat = urunAdedi*listeFiyati*0.85;
                System.out.println("15 indirimli fiyati : " + toplamFiyat + " TL");
            }
        }
    }
}
