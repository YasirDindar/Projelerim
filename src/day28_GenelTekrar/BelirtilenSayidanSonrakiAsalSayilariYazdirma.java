package day28_GenelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BelirtilenSayidanSonrakiAsalSayilariYazdirma {
    public static void main(String[] args) {

        /*
         * Write a program that accepts an integer as input and prints first 10 prime
         * numbers greater than input Check 5numbers if they are even or not in a return method.
         *
         * Input : 5
         *
         * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = scan.nextInt();
        int sayac ;
        List<Integer> asalSayilarList = new ArrayList<>();

        for (int i =sayi + 1; i >0 ; i++) {
            sayac=0;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    sayac=1;
                    break;
                }
            }
            if (sayac==0){
                asalSayilarList.add(i);
            }
            if (asalSayilarList.size()==10){
                break;
            }
        }
        System.out.println(asalSayilarList);
    }
}
