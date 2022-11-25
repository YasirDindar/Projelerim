package day20_Array;

import java.util.Arrays;

public class ArrayElemanlariSagaKaydirma {
      /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]
      */
      public static void main(String[] args) {
          int [] arr = {1,3,5,7};
          arr = arrayiSagaKaydir(arr);
          System.out.println(Arrays.toString(arr));

      }public static int[]arrayiSagaKaydir(int[]arr){
          int bosKova = arr[arr.length-1];
        for (int i = arr.length-2; i >=0 ; i--) {
            arr[i+1]=arr[i];
        }arr[0]=bosKova;
        return arr;
    }
}
