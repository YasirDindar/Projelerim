package day27_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class ArrayListdeIstenmeyenElemanlariSilme {
    public static void main(String[] args) {
        /*
Soru-Listede 15 veya 13 varsa, bu elemanları kaldırınız.
Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
         */
        List<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(31);
        list.add(15);
        list.add(13);
        list.add(54);

        List<Integer>output = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)!=15 && list.get(i)!=13){
                output.add(list.get(i));
            }
        }
        System.out.println("output = " + output);
    }
}
