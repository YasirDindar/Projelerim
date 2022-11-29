package day24_Array_ArrayList_MDA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirilenSayininTamBolenlerListesi {
    public static void main(String[] args) {
        /*
Soru-Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
tamsayilari bir liste olarak bize donduren bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Tam sayi giriniz");
        int sayi = scan.nextInt();

        List<Integer>pozitifTamSayilarListesi = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                pozitifTamSayilarListesi.add(i);
            }
        }
        System.out.println("Pozitif tam sayilar listesi : "+pozitifTamSayilarListesi);
    }
}
