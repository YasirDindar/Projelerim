package day01_PrimitiveDataTurleri;

import java.util.Scanner;

public class İkiDegerinYeriniDegistirme {
    public static void main(String[] args) {
        // Soru: Kullanicidan iki sayi alip ikisinin degerlerini degistirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk tam sayiyi giriniz");
        int sayi1 = scan.nextInt();;

        System.out.println("Lutfen ikinci tam sayiyi giriniz");
        int sayi2 = scan.nextInt();;

        //bu iki sayinin yerini degistirmek icin bir bos deger atanmasi gerekiyor

        int bos;

        //birinci adim: sayi2 variable'ini bos variable'ina koyariz
        bos= sayi2;
        //ikinci adim: sayi2 artik bos bir variable oldu.Sayi1 deki degeri sayi2 ye atariz.
        sayi2=sayi1;
        //ucuncu adim: sayi1 artik bos bir variable oldu.Bos variable'daki degeri sayi1 ye atariz.
        sayi1=bos;

        //tum atamaların degistigini gormek icin yazdiralim.

        System.out.println("Sayi1'in degeri :"+ sayi1+
                            "\nSayi2'in degeri :" +sayi2);
    }
}
