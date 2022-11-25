package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class KullanicidanArrayeElemanEkleme {
    //kullanicidan istedigi kadar sayi alip bir array olusturun. kullanici eleman girisini bitirmek icin 0!a bassin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {0};
        int girilenSayi = 0;

        do {
            System.out.println("Arraye eleman eklemek icin bir tamsayi giriniz\n" +
                    "Bitirmek icin 0'a basiniz");
            girilenSayi = scan.nextInt();
            if (arr[0] == 0) {
                arr[0] = girilenSayi;
            } else if (girilenSayi != 0) {
                arr = ArrayeElemanEklemeMethodu.arrayeElemanEklemeMethodu(arr, girilenSayi);
            }
        } while (girilenSayi != 0);
        System.out.println(Arrays.toString(arr));
    }
}