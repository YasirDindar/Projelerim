package day19;

import java.util.Arrays;

public class ArrayElemanlarini2Artirma {
    /*
Soru-Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
Eski array’i yeni haliyle kaydedin.
     */
    public static void main(String[] args) {
        int []arr = {2,5,8,12};
        arr = elementleriIkiArtirma(arr);
        System.out.println(Arrays.toString(arr));

    }public static int[]elementleriIkiArtirma(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] +=2;
        }
    return arr;
    }

}
