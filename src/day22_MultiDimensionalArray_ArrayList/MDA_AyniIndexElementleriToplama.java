package day22_MultiDimensionalArray_ArrayList;

import java.util.Arrays;

public class MDA_AyniIndexElementleriToplama {
    public static void main(String[] args) {
        //Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        // input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
        // output:                      [5, 7, 11]

     int [][] arr = {{2,4,5},{3,7,9,10}};

     int ortakIndexSayisi = arr[0].length<arr[1].length ? arr[0].length : arr[1].length;
     int []ortakIndexSayilariToplamlariArr = new int[ortakIndexSayisi];
        for (int i = 0; i <ortakIndexSayilariToplamlariArr.length ; i++) {
            ortakIndexSayilariToplamlariArr[i] = arr[0][1]+arr[1][i];
        }
        System.out.println(Arrays.toString(ortakIndexSayilariToplamlariArr));
    }
}
