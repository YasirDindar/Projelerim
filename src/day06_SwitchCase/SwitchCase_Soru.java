package day06_SwitchCase;

import java.util.Scanner;

public class SwitchCase_Soru {
    public static void main(String[] args) {
        /*
        J : JAVA
        D : DEVOLEPMENT
        T : Tester
        KULLANICIDAN BİR HARF ALIN
        ALINAN HARF J,D,T 'DAN BİRİSİ İSE YUKARIDAKİ KELİMELERİ YAZDIRIN.
        BU HARFLERDEN BİRİ DEĞİLSE "GEÇERSİZ HARF"YAZDIRIN.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        switch (harf){
            case 'j':
            case 'J':
                System.out.println("Java"); break;
            case 'd':
            case 'D':
                System.out.println("Devolepment"); break;
            case 't':
            case 'T':
                System.out.println("Tester"); break;
            default: System.out.println("Gecersiz harf");
        }
    }
}
