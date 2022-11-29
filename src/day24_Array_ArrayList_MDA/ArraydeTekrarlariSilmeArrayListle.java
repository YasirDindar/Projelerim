package day24_Array_ArrayList_MDA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraydeTekrarlariSilmeArrayListle {
    public static void main(String[] args) {
        /*
Soru- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
         */
        int [] arr = {1,2,2,4,5,7,3,2,1,5,6,5,8,9,6,5,8};

        arr = tekrarEdenleriSil(arr);
        System.out.println(Arrays.toString(arr));

    }public static int [] tekrarEdenleriSil(int [] arr ){
        List<Integer>sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (!sayilar.contains(arr[i]))
                sayilar.add(arr[i]);
            }
            arr = new int[sayilar.size()];

            for (int i = 0; i <sayilar.size() ; i++) {
                arr[i]=sayilar.get(i);
            }
        return arr;
    }

}
