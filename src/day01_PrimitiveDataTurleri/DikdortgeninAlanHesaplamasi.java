package day01_PrimitiveDataTurleri;

import java.util.Scanner;

public class DikdortgeninAlanHesaplamasi {
    public static void main(String[] args) {
        //Soru: Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //       dikdortgenin alanini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin 2 kenar uzunlugunu giriniz.+" +
                            "\niki kenar uzunlugu arasinda enter'a basiniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("Dikdortgenin alani :" +kenar1*kenar2);
    }
}
