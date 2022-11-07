package day04;

import java.util.Scanner;

public class IfElseIfSoru {
    /*
     Soru :kullanicidan bir tam sayi alin
     sayi negatif ise "gecersiz sayi"
     tek basamakli ise "rakam"
     iki basamakli ise "iki basamakli sayi"
     bunun disindaki sayilar icin "buyuk sayi" yazdiri
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi < 0) {
            System.out.println("Gecersiz sayi");
        } else if (sayi<10) {
            System.out.println("Rakam");
        } else if (sayi<=99) {
            System.out.println("İki basamakli sayi");
        }else {
            System.out.println("Buyuk sayi");
        }
    }
}
