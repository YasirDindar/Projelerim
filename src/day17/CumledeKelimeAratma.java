package day17;

import java.util.Scanner;

public class CumledeKelimeAratma {
    /*
         * Kullanicidan bir kelime ve cumle aliniz
         * Kelimeyi cumle icinde aratip yazdiriniz
         *
         * Orn : Cumle = "hihihi"
    String = "hi"
    output = "hihihi" ' nin icinde 3 tane "hi" var
            * Orn : Cumle = "Yoldayim"
    String = "yol"
    output = "Yoldayim" in icinde 1 tane "yol" var
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen kelime giriniz");
        String kelime = scan.nextLine();
        int sayac = 0;

        for (int i = 0; i <cumle.length()-kelime.length() ; i++) {
            if (cumle.substring(i,i+kelime.length()).equalsIgnoreCase(kelime)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Aranan kelime cumlede yer almamaktadir");
        } else if (sayac>=1) {
            System.out.println("Aranan kelime "+ sayac + "kere gecmektedir");
        }
    }
}
