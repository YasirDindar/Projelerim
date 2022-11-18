package day15;

import java.util.Scanner;

public class VizeIleFinalNotlarininOrtalamasiniBulma {
    public static void main(String[] args) {
     /*
Kullanicidan alacaginiz vize1 vize2 ve final notlarini
vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
*/
        Scanner scan = new Scanner(System.in);
        System.out.print("1.vize notunuzu giriniz : ");
        int vize1 = scan.nextInt();
        System.out.print("2.vize notunuzu giriniz : ");
        int vize2 = scan.nextInt();
        System.out.print("Final notunuzu giriniz : ");
        int finalNotu = scan.nextInt();

        double ortalama = ((vize1 + vize2) / 2 * 0.3 + finalNotu * 0.7);

        //sinifi gecme not ortalamasi :  olsun. AA=> 90-100 BA=>80-89 BB=>70-79 CA=>60-69 CB=>50-59  FF=> 49<=
        if (ortalama >= 90 && ortalama <= 100) {
            System.out.println(ortalama + " Notunuz AA");
        } else if (ortalama > 80) {
            System.out.println(ortalama + "Notunuz BA");
        } else if (ortalama > 70) {
            System.out.println(ortalama + "Notunuz BB");
        } else if (ortalama > 60) {
            System.out.println(ortalama + "Notunuz CA");
        } else if (ortalama > 50) {
            System.out.println(ortalama + "Notunuz CB");
        } else {
            System.out.println("Maalesef sinifta kaldiniz");
        }
    }
}