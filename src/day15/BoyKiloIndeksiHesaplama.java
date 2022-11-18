package day15;

import java.util.Scanner;

public class BoyKiloIndeksiHesaplama {
    /*
Kullanicidan kilosunu ve boyunu alip
Vucut kitle indeksini hesaplayan bir program yaziniz.
Ipucu : Vucut Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
ORNEK:
INPUT      : Kilo: 71
                           Boy: 1,72
OUTPUT  : Vucut Kitle Indeksiniz : 23
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        double kilo = scan.nextDouble();
        System.out.print("Boyunuzu giriniz : ");
        double boy = scan.nextDouble();

        double vke =kilo*boy*1000;
        System.out.print("Vucut kilo indeksiniz : "+vke);
    }
}
