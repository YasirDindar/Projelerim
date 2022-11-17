package day14;

import java.util.Scanner;

public class StringIfadeleriKarsilatirma {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Isminizi giriniz : ");
        String isim = scan.nextLine();
        System.out.print("Soyadinizi giriniz : ");
        String soyad = scan.nextLine();

        if (isim.length()>soyad.length()){
            System.out.println("İsim soyad'dan daha fazla karakter icermektedir");
        }else {
            System.out.println("Soyad isimden daha fazla karakter icermektedir.");
        }
    }
}
