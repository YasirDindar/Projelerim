package day01_PrimitiveDataTurleri;

import java.util.Scanner;

public class CharKarakterindenSonraGelenKarakterleriYazdirma {
    public static void main(String[] args) {
        /*
        // Soru : Kullanicidan char bir karakter alin
        // o karakterden sonra gelen 3 karakteri yazdirin
        // ornek input : a , output : bcd
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);

        System.out.println(""+(char)(girilenKarakter+1)+(char)(girilenKarakter+2)+(char)(girilenKarakter+3));

    }
}
