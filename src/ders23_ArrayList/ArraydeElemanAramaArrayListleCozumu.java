package ders23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArraydeElemanAramaArrayListleCozumu {
    public static void main(String[] args) {
        /*
Soru- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
kullanildigini bulup listeye atiniz
         */
        int []arr = {2,3,1,4,7,5,8,6,2,9,2};
        List<Integer>sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        int sayac = 0;
        int istenenEleman = 2;

        for (int i = 0; i <sayilar.size() ; i++) {
            if (sayilar.get(i)==istenenEleman){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Aranan eleman listede yer almiyor");
        }else {
            System.out.println("Aranan "+istenenEleman+" sayisi arraylist'de "+sayac+ " kere kullanilmis");
        }
    }
}
