package day07_StringManipulation;

import java.util.Scanner;

public class StringManipulations_Soru1 {
    public static void main(String[] args) {
          /*
         Kullanıcıdan bir cümle ve bir metin alın.
        Cümlede metnin durumuna göre
        1-cümle metni içermiyor
        2-cümle metni sadece 1 kere içeriyor
        3-cümle metni birden fazla içeriyor
        seçeneklerinden uygun olanı yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Bir kelime giriniz");
        String kelime = scan.nextLine();

        int ilkIndex = cumle.indexOf(kelime);
        int sonIndex = cumle.lastIndexOf(kelime);

        if (ilkIndex==(-1)){
            System.out.println("Cumle metni icermiyor");
        } else if (ilkIndex==sonIndex) {
            System.out.println("Cumle metni sadece 1 kere iceriyor");
        }else {
            System.out.println("Cumle metni birden fazla iceriyor");
        }
    }

}
