package ders23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayPozTamsayiTopArrayListleCoz {
    public static void main(String[] args) {
       /*
Soru- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
method yaziniz.
        */
        int []arr = {1,5,-6,4,-3};

        System.out.println(pozitifSayilariToplama(arr));

    }public static int pozitifSayilariToplama(int[]arr){
        int toplam = 0;
        List<Integer>sayilar = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        for (int i = 0; i <sayilar.size() ; i++) {
            if (arr[i]>0){
                toplam += sayilar.get(i);
            }
        }
        return  toplam;
    }
}
