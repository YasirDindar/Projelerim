package day25_GenelTekrar;

import java.util.Scanner;

public class While_TamKare {
    public static void main(String[] args) {
        /*
        Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.
            Not: sqrt gibi fonksiyonları  kullanmayın.
            Example 1:
                Input: 16
                Output: true
                Not: bu sayı tamkare çünkü 4*4 = 16
            Example 2:
                Input: 25
                Output: true
                Not: bu sayı tamkare çünkü 5*5=25
            Example 3:
                Input: 14
                Output: false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        int count = 1;
        boolean a = false;

        while (count*count<=sayi){
            if (count*count==sayi){
                a = true ;
                System.out.println("Bu sayi tam karedir. "+count+" * "+count+" =" +sayi) ;
            }
            count++;
        }
        if (!a) System.out.println("Bu sayi tam kare degildir");
    }
}
