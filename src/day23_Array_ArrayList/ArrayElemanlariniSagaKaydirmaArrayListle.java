package day23_Array_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayElemanlariniSagaKaydirmaArrayListle {
    public static void main(String[] args) {
        /*
Soru- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
basa tasiyip, array’i list haliyle kaydedin.
Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */
        int []arr = {4,6,2,3,1,4,8,7};
        List<Integer>sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        int bosKova = sayilar.get(sayilar.size()-1);
        for (int i = sayilar.size()-2; i >=0 ; i--) {
            sayilar.set(i+1,sayilar.get(i));
        }
        sayilar.set(0,bosKova);
        System.out.println(sayilar);

    }
}
