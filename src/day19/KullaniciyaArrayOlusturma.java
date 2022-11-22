package day19;


import java.util.Arrays;
import java.util.Scanner;

public class KullaniciyaArrayOlusturma {
    /*
    Soru-Kullanicidan array’in boyutunu ve
    elementlerini alip array’i olusturan ve bize donduren bir method olusturun.

    kullanicidan array olusturmasini istedigimizde method olustururken parametre bos birakilir
    */
    public static void main(String[] args) {
        int[] kullaniciArrayi = kullaniciyaArrayOlusturma();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }

    private static int[] kullaniciyaArrayOlusturma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturulacak array'in boyutunu giriniz");
        int boyut = scan.nextInt();
        int[]kullaniciArrayi = new int[boyut];

        for (int i = 0; i <boyut ; i++) {
            System.out.println("Array'e eklenecek sayi giriniz");
            kullaniciArrayi[i] = scan.nextInt();
        }
    return kullaniciArrayi;
    }

}
