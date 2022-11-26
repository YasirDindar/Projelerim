package day22_MultiDimensionalArray_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //verilen bir Array'deki tekrar eden sayilari bir kere olacak sekilde array'i duzenleyin.
        int []arr = {1,2,4,7,8,5,2,1,3,6,9,9,5,3,6};
        List<Integer>tekrarsizListe = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (!(tekrarsizListe.contains(arr[i]))){
                tekrarsizListe.add(arr[i]);
            }
        }
        System.out.println("Tekrarsiz liste : "+tekrarsizListe);

        arr= new int[tekrarsizListe.size()];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = tekrarsizListe.get(i);
        }
        System.out.println("Array'in tekrarsiz hali : " + Arrays.toString(arr));
    }
}
