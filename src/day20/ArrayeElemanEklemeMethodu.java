package day20;

import java.util.Arrays;

public class ArrayeElemanEklemeMethodu {
    //verilen bir int array'e istenen bir elementi ekleyip yeni halini bize donduren bir method ousturun.
    public static void main(String[] args) {
    int []arr = {6,5,7,9};
    int eklenecekSayi = 3;

    arr=arrayeElemanEklemeMethodu(arr,eklenecekSayi);
        System.out.println(Arrays.toString(arr));//[6, 5, 7, 9, 3]

    }public static int[]arrayeElemanEklemeMethodu(int []arr,int eklenecekSayi){
        int []yeniArr = new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]= arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekSayi;
        return yeniArr;
    }
}
