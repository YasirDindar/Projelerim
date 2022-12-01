package day26_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class ArrayinUzunlugunaGoreYazdirma {
    public static void main(String[] args) {
        /*
Soru-Verilen String bir array’deki her bir elementi kontrol edip,
-Kelimenin uzunlugu cift sayi ise ilk yarisini
-Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
yeni bir listeye ekleyip yazdirin.
         */
        String []arr = {"Yasir","Muhammed","Huzeyfe","Ubeyde"};
        List<String>liste = new ArrayList<>();
        for (String kelime:arr) {
            if (kelime.length()%2 ==0){
                liste.add(kelime.substring(0,kelime.length()/2));
            }else {
                liste.add(kelime.substring((kelime.length()-1)/2));
            }
        }
        System.out.println(liste);
    }
}
