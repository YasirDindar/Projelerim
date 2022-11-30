package ders25_GenelTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraydeTekrarEdenSayilariSilme {
    public static void main(String[] args) {
        /*
Soru-Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
         */
        int []arr = {3,5,4,6,8,7,7,5,1,2,3,5,2,6,9,0,1,0,4,5,8,6,9};


    }
    public static void arrayinElementleriniBirKezYazdirma(int []arr){
        List<Integer>yeniListe = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if (!yeniListe.contains(arr[i])){
                yeniListe.add(arr[i]);
            }
        }
        arr = new int[yeniListe.size()];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = yeniListe.get(i);
        }
        System.out.println("Yeni array : "+ Arrays.toString(arr));
    }
}
