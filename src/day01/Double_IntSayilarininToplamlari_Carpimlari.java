package day01;

import java.util.Scanner;

public class Double_IntSayilarininToplamlari_Carpimlari {
    public static void main(String[] args) {
        /*
        Soru: Kullanicidan bir double, bir de int sayi aliniz.
        Aldiginiz sayilarin toplamini ve carpimini yazdiriniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli sayi giriniz");
        double ondalikliSayi = scan.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz");
        int tamSayi = scan.nextInt();

        System.out.println("Girilen iki sayinin toplami: "+ (ondalikliSayi+tamSayi));
        System.out.println("Girilen iki sayinin carpimi: "+ (ondalikliSayi*tamSayi));

    }
}
