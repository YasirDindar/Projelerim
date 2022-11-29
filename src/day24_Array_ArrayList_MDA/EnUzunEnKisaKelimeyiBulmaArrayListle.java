package day24_Array_ArrayList_MDA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnUzunEnKisaKelimeyiBulmaArrayListle {
    public static void main(String[] args) {
        /*
Soru-Verilen String bir array’deki en uzun ve en kisa kelimeleri liste donusturun.
         */
        String[] kelimeler = {"ali", "Mahir", "Yasar", "Muhammed"};

        List<String> kelimelerListesi = new ArrayList<>();

        for (int i = 0; i <kelimeler.length ; i++) {
            kelimelerListesi.add(kelimeler[i]);

        }
        List<String> enUzunKelime = Collections.singletonList(kelimelerListesi.get(0));
        List<String> enKisaKelime = Collections.singletonList(kelimelerListesi.get(0));


        for (int i = 0; i <kelimelerListesi.size() ; i++) {

            if (kelimelerListesi.get(i).length()>=enUzunKelime.size()){
                enUzunKelime= Collections.singletonList(kelimelerListesi.get(i));

            } else if (kelimelerListesi.get(i).length()<=enKisaKelime.size()) {
                enKisaKelime= Collections.singletonList(kelimelerListesi.get(i));
            }

        }
        System.out.println("en uzun kelime : " + enUzunKelime);
        System.out.println("en kısa kelime : " + enKisaKelime);


    }
}
