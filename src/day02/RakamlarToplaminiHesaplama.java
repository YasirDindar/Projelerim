package day02;

import java.util.Scanner;

public class RakamlarToplaminiHesaplama {
    public static void main(String[] args) {
        /*
        Soru : Kullanicinin girdigi 4 basamakli bir sayinin
        rakamlar toplamini veren bir kod yaziniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        int birlerBasamagi ;
        int rakamlarToplami =0;

        /*Henuz for dongusune gecmedigim icin bu soruyu 4 basamakli sayi oldugu icin
        4 asamada cozecegim.
         */
        birlerBasamagi= sayi %10; //1- Birler basamagini aldik
        rakamlarToplami = birlerBasamagi; //2- Birler basamagini rakamlar toplamina ekledik
        sayi =sayi/10;//3- Birler basamagindan kurtuluruz.

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi =sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi =sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi =sayi/10;

        System.out.println("Verilen sayinin rakamlar toplami : " +rakamlarToplami);

    }
}
