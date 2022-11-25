package day10_MethodOlusturma;

import java.util.Scanner;

public class MethodOlusturmaCarpma {
    public static void main(String[] args) {
        /*
        Soru - Main method içerisinde kullanıcıdan iki sayi alin.
        Bu iki sayiyi parametre olarak kabul edip,çarpımlarini main methoda bize döndüren bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("İki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("Carpim sonucu : " +carpimMethodu(sayi1, sayi2));
    }
    public static double carpimMethodu(double sayi1,double sayi2){
        return  sayi1*sayi2;
    }
}
