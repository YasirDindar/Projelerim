package day20_Array;

import java.util.Arrays;

public class ArraydekiEnBuyukVeEnKucukSayiyiBulma {
    //Verilen bir int array'de en kucuk ve en buyuk sayilari yazdiran bir method olusturalim.
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 6, 4, 9, 7};

        enKucukEnBuyukSayiyiYazdir(arr);
    }

    public static void enKucukEnBuyukSayiyiYazdir(int[] arr) {
        Arrays.sort(arr);
        System.out.println("En buyuk sayi : " + arr[arr.length-1]);
        System.out.println("En kucuk sayi : " + arr[0]);
    }
}
