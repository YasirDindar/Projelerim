package day16;

import java.util.Scanner;

public class CharinTekrarSayisiniBulma {
    /*
        Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
       char ch= 'e' ;
       String name ="Sevecen"
       => Tekrar Sayisi = 3
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String kelime = scan.nextLine();
        System.out.println("Karakter giriniz");
        char chr = scan.next().charAt(0);
        int tekrarSayisi = 0;

        for (int i = 0; i <kelime.length() ; i++) {
            if (chr==kelime.charAt(i)){
                tekrarSayisi++;
            }
        }
        System.out.println("Tekrar sayisi : " +tekrarSayisi);
    }
}
