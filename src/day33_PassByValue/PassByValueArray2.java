package day33_PassByValue;

import java.util.Arrays;

public class PassByValueArray2 {
    public static void main(String[] args) {
       /*
bir method olusturun sayilar arrayinin uzunlugundan 2 fazla olan
ve elemenetlerin tamami 5 olan yeni bir array olusturup
deger olarak sayilar arrayine atayin ve sayilar arrayini yazdirin
        */
        int[]arr ={3,4,5};
        arrayeYeniDegerAta(arr);//[5, 5, 5, 5, 5]
        System.out.println(Arrays.toString(arr));//[3, 4, 5]

    }public static void arrayeYeniDegerAta(int[]arr){
        //yeni array olusturalim
        int[]yeniArr = new int[arr.length+2];
        //elementlerin tamami 5 olan yeni bir array olusturup
        for (int i = 0; i <yeniArr.length ; i++) {
            yeniArr[i]=5;
            //deger olarak sayilar arrayine atayin ve sayilar arrayini yazdirin
            arr=yeniArr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
