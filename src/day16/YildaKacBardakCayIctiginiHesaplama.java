package day16;

import java.util.Scanner;

public class YildaKacBardakCayIctiginiHesaplama {
    public static void main(String[] args) {
    /*
Kullaniciya
* 1 = Gunde kac bardak cay ictigini,
* 2 = Her bardak icin kac kup seker kullandigini sorup;
kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
* Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
 (1 kup seker = 2.77 gr)
     */
   Scanner scan = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsun");
        double cay = scan.nextDouble();
        System.out.println("Her bardak icin kac seker atiyorsun");
        double seker = scan.nextDouble();

        double yillikTuketimKG = (cay*seker*2.77)*365/1000;
        double kirkYillikTuketimKg = yillikTuketimKG*40;

        if (seker==0){
            System.out.println("Aferin, boyle devam et");
        }else {
            System.out.println("Yilda "+yillikTuketimKG+" kg kullaniyorsunuz");
            System.out.println("40 Yilda "+kirkYillikTuketimKg+" kg kullaniyorsunuz.");
        }
    }
}
