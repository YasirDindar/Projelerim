package day24_Array_ArrayList_MDA;

import java.util.ArrayList;
import java.util.List;

public class ArrayListteIstenmeyenElemaniSilme {
    public static void main(String[] args) {
        /*
Soru-Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
kismini list olarak bize donduren bir method olusturun
         */
        String [] isim = {"Yasir","Abdullah","Yasar","Sare"};

        char istenmeyenEleman = 'b';

        List<String> isimlerListesi = new ArrayList<>();

        for (int i = 0; i <isim.length ; i++) {
            isimlerListesi.add(isim[i]);

        }
        List<String> sonisimlerListesi = new ArrayList<>();
        for (int i = 0; i <isimlerListesi.size() ; i++) {
            if (!isimlerListesi.get(i).substring(0).contains(""+istenmeyenEleman)){
                sonisimlerListesi.add(isimlerListesi.get(i));
            }
        }

        System.out.println(sonisimlerListesi);
    }
}
