package day12_WhileLoop;

import java.util.Scanner;

public class WhileLoopSoru {
    /*
    Kullanicidan toplanmak uzere tamsayilar alin.
    Kuullanici 0 a basarsa sayi alma islemini bitirin.

    Kullancinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 1;
        int sayac = 0;
        int toplam =0;

        while (sayi !=0){
            System.out.println("Lutfen toplamak icin bir tamsayi giriniz.Bitirmek icin 0' basiniz");
            sayi=scan.nextInt();

            if (sayi!=0){
                sayac++;
                toplam += sayi;
            }
        }
        System.out.println("Girilen "+sayac +" sayinin toplami : "+toplam);
    }
}
