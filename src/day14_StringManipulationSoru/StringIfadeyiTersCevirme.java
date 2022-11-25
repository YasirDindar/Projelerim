package day14_StringManipulationSoru;

import java.util.Scanner;

public class StringIfadeyiTersCevirme {
    /*
    Kullanicidan bir kelime isteyin ve girilen kelimeyi tersten yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String kelime = scan.nextLine();
        String kelimeninTersi = "";

        for (int i = kelime.length()-1 ; i >=0; i--) {
            kelimeninTersi += kelime.charAt(i);
        }
        System.out.println(kelimeninTersi);
    }

}
