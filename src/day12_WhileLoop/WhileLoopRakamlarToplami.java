package day12_WhileLoop;

import java.util.Scanner;

public class WhileLoopRakamlarToplami {
    /*
    Kullanicidan bir sayi alin.Alinan sayinin rakamlar toplamini bulunuz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin bir tam sayi giriniz");
        int sayi = scan.nextInt();

        int birlerBas = 0;
        int rakamlarToplami = 0;
        while (sayi!=0){
            birlerBas = sayi%10;
            rakamlarToplami += birlerBas;
            sayi =sayi/10;
        }
        System.out.println(rakamlarToplami);
    }
}
