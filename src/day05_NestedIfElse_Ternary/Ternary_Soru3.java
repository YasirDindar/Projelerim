package day05_NestedIfElse_Ternary;

import java.util.Scanner;

public class Ternary_Soru3 {
    /*
     //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin 3 kenar uzunlugunu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "Eskenar ucgen" : "Eskenar ucgen degil");
    }

}
