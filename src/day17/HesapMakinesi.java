package day17;

import java.util.Scanner;

public class HesapMakinesi {
    /*
        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         dort islemden biri ile isleme koyup sonucunu yazdiriniz
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int toplama = sayi1 + sayi2;
        int cikarma = sayi1 - sayi2;
        int carpma  = sayi1 * sayi2;
        int bolme   = sayi1 / sayi2;

        System.out.println("Lutfen yapmak istediginiz islemi seciniz" +
                "\n1 toplama\n2 cıkarma\n3 carpma\n4 bolme");

        int dortIslem = scan.nextInt();

        switch (dortIslem){
            case 1 : System.out.println("Toplama sonucu :" + toplama); break;
            case 2 : System.out.println("Cikarma sonucu :" + cikarma); break;
            case 3 : System.out.println("Carpma  sonucu :" + carpma);  break;
            case 4 : System.out.println("Bolme   sonucu :" + bolme);   break;
            default: System.out.println("Girilen islem turu gecersizdir");
        }

    }

}
