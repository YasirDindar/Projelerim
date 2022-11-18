package day15;

import java.util.Scanner;

public class IsciProblemi {

     /*  Problem Tanımı
Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
hesaplayan kodu yazınız.
Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
Buna göre 2 işçi aynı işi kaç günde yapar?
Örnek Ekran Çıktısı
Bir işçi işi kaç günde bitirmektedir? 10
Toplam kaç işçi çalışacak? 2
İşin bitme süresi 5 gündür.
     */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Bir iscinin is bitirme suresi kac gundur ?");
         int isBitirmeSuresi = scan.nextInt();

         System.out.println("Bu iste kac isci calisacak ?");
         int isciSayisi = scan.nextInt();

         int isinBitmeSuresiniHesaplama = isBitirmeSuresi/isciSayisi;
         System.out.println("İsin bitmesuresi :" +isinBitmeSuresiniHesaplama + " gundur");
     }
}
