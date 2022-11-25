package day08_ForLoop;

import java.util.Scanner;

public class ForLoopRakamlarToplami {
    public static void main(String[] args) {
        //Kullanicinin verdigi sayinin rakamlar toplamini bul
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = scan.nextInt();

        String sayiStr = ""+sayi;
        int birlerBas=0;
        int rakamlarTop=0;
        for (int i = 1; i <=sayiStr.length() ; i++) {
            birlerBas=sayi%10;
            rakamlarTop+=birlerBas;
            sayi=sayi/10;
        }
        System.out.println(rakamlarTop);
    }
}
