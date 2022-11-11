package day08;

import java.util.Scanner;

public class StringManipulations_Soru {
    public static void main(String[] args) {
        /*
        Soru: Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
        kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        eger tum sartlari saglarsa,
        “sifre basariyla kaydedildi” yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scan.nextLine();

        int bayrak =0; // bayrak koymamizin sebebi tum sartlarin kontrol edilecek olmasindan dolayidir
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("İlk harf kucuk harf icermelidir");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("Son karakter rakam olmalidir");
            bayrak++;
        }
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            bayrak++;
        }
        if (!((sifre.length()>=10))){
            System.out.println("Sifre en az 10 karakter icermeli");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("sifre basariyla kaydedildi");
        }
    }
}
