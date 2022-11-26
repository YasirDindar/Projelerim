package day22_MultiDimensionalArray_ArrayList;

import java.util.Arrays;

public class MDA_IcArraydekiElemanlariToplama {
    public static void main(String[] args) {
        //Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        // input :     int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        // output:                      [10, 3, 12, 10, 9]
    int [][]arr = {{26,11,20,22},{11,52,11,25},{24},{10,22}};
    int [] tekKatliArr = new int[arr.length];
    int innerArrToplami = 0;
        for (int i = 0; i <arr.length ; i++) {
            innerArrToplami=0;
            for (int j = 0; j <arr[i].length ; j++) {
                innerArrToplami += arr[i][j];
            }
            tekKatliArr[i] = innerArrToplami;
        }
        System.out.println(Arrays.toString(tekKatliArr));
    }
}
