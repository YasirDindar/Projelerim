package day20;

import java.util.Arrays;

public class ArrayeYeniElemanEkleme {
    public static void main(String[] args) {
        int [] arr1 = {2,4,1};
        int [] arr2 = new int[arr1.length+1];//arr2 [0, 0, 0, 0]

        for (int i = 0; i <arr1.length ; i++) {
            arr2[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr2));//arr2 [2, 4, 1, 0]

        arr2[arr2.length-1]=5;//arr2 [2, 4, 1, 5]

        arr1 = arr2;
        System.out.println("arr1'in son hali : " + Arrays.toString(arr1));//[2, 4, 1, 5]
    }
}
