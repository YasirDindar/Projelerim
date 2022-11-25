package day01_PrimitiveDataTurleri;

import java.util.Scanner;

public class İkiDoubleSayininDortİslemSonucunuTamSayiYazdirma {
    public static void main(String[] args) {
        //  Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucununun tamsayi kismini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        //ilk olarak bu iki sayiyi toplayalim.
        int toplamaSonucuTamSayi = (int)(sayi1+sayi2);
        System.out.println("Toplama Sonucu :" +toplamaSonucuTamSayi);

        //bu iki sayiyi carpalim.
        int carpmaSonucuTamSayi = (int)(sayi1*sayi2);
        System.out.println("Carpma Sonucu :" +carpmaSonucuTamSayi);

        //bu iki sayiyi bolelim.
        int bolmeSonucuTamSayi = (int)(sayi1/sayi2);
        System.out.println("Bolme Sonucu :" +bolmeSonucuTamSayi);

        //bu iki sayiyi cikartalim.
        int cıkarmaSonucuTamSayi = (int)(sayi1-sayi2);
        System.out.println("Cıkartma Sonucu :" +toplamaSonucuTamSayi);

    }
}
