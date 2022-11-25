package day06_SwitchCase;

import java.util.Scanner;

public class StringIfadeyIBuyukHarfYapma {
    /*
    Kullacinin girdigi cumleyi buyuk harf yazdiralim
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = scan.nextLine();

        cumle= cumle.toUpperCase();
        System.out.println(cumle);
    }

}
