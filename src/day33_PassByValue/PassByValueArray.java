package day33_PassByValue;

import java.util.Arrays;

public class PassByValueArray {
    public static void main(String[] args) {
        /*
        verilen bir arrayin elementlerini 5 artirin
        sonra yazilan bir method olusturun
         */
        int[]arr ={3,4,5};
        elementleri5Artir(arr);//[8, 9, 10]
        elementleri5Artir(arr);//[13, 14, 15]

        System.out.println(Arrays.toString(arr));//[13, 14, 15]

    }public static void elementleri5Artir(int []arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=5;
        }
        System.out.println(Arrays.toString(arr));
    }
}
