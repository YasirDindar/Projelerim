package day03_IfStatements;

import java.util.Scanner;

public class IfElse_KarakterBuyukHarfİceriyorMu {
    public static void main(String[] args) {
        /*
        Soru - Kullanicidan bir karakter girmesini isteyin,
        girilen karakterin buyuk harf olup olmadigini yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krakter = scan.next().charAt(0);

        if (krakter>='A' && krakter<='Z'){
            System.out.println("Karakter Buyuk harf");
        } else {
            System.out.println("Karakter buyuk harf degil");
        }
    }
}
