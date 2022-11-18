package day15;

import java.util.Scanner;

public class KareHesaplama {
    /*
Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
Örnek Ekran Çıktısı
a sayısını giriniz: 5
b sayısını giriniz: 3
c sayısını giriniz: 1
sonuç : 5.333333333333333
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sirasiyla 3 sayi giriniz");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c= scan.nextDouble();

        double sonuc = ((a*a)-(b*b))/(c*3);
        System.out.println(sonuc);
    }
}
