package day16;

import java.util.Scanner;

public class DogumGunuKiyaslama {
    /*
  Kullanicidan iki farkli dogum gunu tarihini alip,
  kimin once dogdugunu consolda yazdiran bir program yaziniz.
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yıl /ay/gun olarak karsilastirmak icin ilk dogum gununuzu giriniz");//Ahmet

        int yil1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gun1 = scan.nextInt();

        System.out.println("Lutfen yıl /ay/gun olarak karsilastirmak icin ikinci dogum gununuzu giriniz");//Ayse

        int yil2 = scan.nextInt();
        int ay2 = scan.nextInt();
        int gun2 = scan.nextInt();

        if (yil1 > yil2) {
            System.out.println("Ayse,Ahmet'ten buyuktur.");
        } else if (yil1 < yil2) {
            System.out.println("Ahmet,Ayse'den buyuktur.");
        } else {    //bu satira gelirsek yillar esittir.Aylara bakmak icin yeni if blogu olusturulur.
            if (ay1 > ay2) {
                System.out.println("Ayse,Ahmet'ten buyuktur.");
            } else if (ay1 < ay2) {
                System.out.println("Ahmet,Ayse'den buyuktur.");
            } else {   //bu satira gelirsek aylar esittir.Aylara bakmak icin yeni if blogu olusturulur.
                if (gun1 > gun2) {
                    System.out.println("Ayse,Ahmet'ten buyuktur.");
                } else if (gun1 < gun2) {
                    System.out.println("Ahmet,Ayse'den buyuktur.");
                } else {
                    System.out.println("Ayni gun dogdunuz");
                }

            }
        }
        //********************************************2.cozum**************************************************
        int ahmetDogumGunu = yil1 * 1000 + ay1 * 100 + gun1; //2010/03/12
        int ayseDogunGunu = yil2 * 1000 + ay2 * 100 + gun2;

        if (ahmetDogumGunu > ayseDogunGunu) {
            System.out.println("Ayse daha buyuktur");
        } else if (ahmetDogumGunu < ayseDogunGunu) {
            System.out.println("Ahmet daha buyuktur");
        } else {
            System.out.println("Aynı gun dogdunuz");
        }
    }
}