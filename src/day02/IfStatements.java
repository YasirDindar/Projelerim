package day02;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        /*
        kullanicidan iki tamsayi alin
        eger birinci sayi 100'den buyukse , "ilk sayi 100'den buyuk" yazdirin
        eger ikinci sayi ciftse, "ikinci sayi cift yazdirin"
        eger ilk sayi, ikinci sayidan buyukse , "ilk sayi daha buyuk" yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lufen iki tamsayi giriniz.");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        if (sayi1>100){
            System.out.println("İlk sayi 100'den buyuk");
            }
        if (sayi2%2==0){
            System.out.println("İkinci sayi cift");
        }
        if (sayi1>sayi2){
            System.out.println("İlk sayi daha buyuk");
        }
    }
}
