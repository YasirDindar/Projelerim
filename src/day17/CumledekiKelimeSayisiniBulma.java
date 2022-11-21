package day17;

import java.util.Scanner;

public class CumledekiKelimeSayisiniBulma {
    public static void main(String[] args) {
        // Kullanicidan bir cumle aliniz.Verilen cumlede kac adet kelime bulundugunu hesaplayan bor kod yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        int sayac = 1;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==' ')
            sayac++;
        }
        System.out.println("Kelimede gecen cumle sayisi : " +sayac);
    }
}
