package day03;

import java.util.Scanner;

public class IfElse_EmekliSorusu {
    public static void main(String[] args) {
        /*
         Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
         yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
          */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Emekli olman icin " +(65-yas) + " sene daha calisman gerekiyor");
        }
    }
}
