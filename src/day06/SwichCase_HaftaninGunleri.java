package day06;

import java.util.Scanner;

public class SwichCase_HaftaninGunleri {
    /*
    Kullanicinin girdigi gun numarasi ile gun ismini yazdiriniz
    Gün kaç girilirse o sayıdan sonraki hepsine duraklama anlamına gelene break; koyulmalıdır.
    Yoksa geriye kalan kısmın hepsini yazdırır.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanin kacinci gunu ?");
        int gunNo = scan.nextInt();

        switch (gunNo){
            case 1: System.out.println("Pazartesi"); break;
            case 2: System.out.println("Sali"); break;
            case 3: System.out.println("Carsamba"); break;
            case 4: System.out.println("Persembe"); break;
            case 5: System.out.println("Cuma"); break;
            case 6: System.out.println("Cumartesi"); break;
            case 7: System.out.println("Pazar"); break;
            default: System.out.println("Gecersiz giris");
        }
    }




}

