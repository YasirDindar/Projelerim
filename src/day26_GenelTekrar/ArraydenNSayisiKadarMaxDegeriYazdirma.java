package day26_GenelTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraydenNSayisiKadarMaxDegeriYazdirma {
    public static void main(String[] args) {
        /*
* verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
* not kisa metodlar kullamayiniz
* Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        int [] input = {1,8,3,6,5,6,7,8,4};
        int n = 3;

        List<Integer>sayi = new ArrayList<>();
        Arrays.sort(input);

        for (int i = 0; i <input.length ; i++) {
            sayi.add(input[i]);
        }
        System.out.println(sayi.subList(sayi.size()-n,sayi.size()));
    }
}
