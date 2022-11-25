package day03_IfStatements;

import java.util.Scanner;

public class IfElse_KucukHarfiBuyukHarfYazdirma {
    public static void main(String[] args) {
        /*
        Soru- Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        yoksa girilen harfi yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        if (karakter>='a' && karakter<='z'){
            System.out.println((char)(karakter-32) );
            /*
            Girilen karakter kucuk harf iceriyor.
            Buyuk harfe cevirmek icin girilen karakterden
            Ascii tablosuna gore -32 cıkarilarak buyuk harfe cevrilir.
             */
        }else {
            System.out.println(karakter);
            //İf calismayip else devreye girdigine gore girilen karakter zaten buyuk harf'dir.
        }
    }
}
