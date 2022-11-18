package day15;

import java.util.Scanner;

public class SporSalonu {
    public static void main(String[] args) {
        /*
Hayat spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Isim ve soyadinizi giriniz :");
        String isim = scan.nextLine();
        System.out.print("Yasinizi giriniz :");
        int yas =scan.nextInt();
        System.out.print("Kilonuzu giriniz :");
        double kilo = scan.nextDouble();
        System.out.print("Boyunuzu giriniz :");
        double boy = scan.nextDouble();
        System.out.print("Ne kadar sure hizmet almak istediginizi giriniz : ");
        int hizmetSuresi = scan.nextInt();

        double toplamUcret = hizmetSuresi*20;
        System.out.println("Isim ve soyadiniz : "+isim+
                            "\nYasinizi giriniz : "+yas+
                            "\nKilonuz : "+kilo+
                            "\nBoyunuz : "+boy+
                            "\nSalona devam edeceginiz sure : "+hizmetSuresi+
                            "\nBu sure icerisinde odeyeceginiz toplam tutar : "+"$"+toplamUcret);
    }
}
