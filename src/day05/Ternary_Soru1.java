package day05;

import java.util.Scanner;

public class Ternary_Soru1 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın. sayı pozitif ise 2 katını yazdırın.
        Sayı pozitif değilse sayıya 10 ekleyip yazdırın
         */
    Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi>0 ? sayi*2 : sayi+10);
    }
}
