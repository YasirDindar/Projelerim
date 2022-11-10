package day07;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulation_Soru2 {
    public static void main(String[] args) {
        /*
        Soru 1 : Kullanicidan bir cumle alin
        -cumlede ev geciyorsa, "home home sweet home" yazdirin
        -cumlede is geciyorsa, "calismak guzeldir"
        -ikisini de iceriyorsa "Hem ev lazim hem is"
        -hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();

        String cumleCopy = cumle.toLowerCase();

        if (cumleCopy.contains("ev")&& cumleCopy.contains("is")){
            System.out.println("Hem ev lazim hem is");
        } else if (cumleCopy.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumleCopy.contains("is")) {
            System.out.println("calismak guzeldir");
        }else {
            System.out.println("cok calisman lazim");
        }

    }
}
