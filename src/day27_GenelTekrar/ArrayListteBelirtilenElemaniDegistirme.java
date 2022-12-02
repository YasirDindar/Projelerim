package day27_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class ArrayListteBelirtilenElemaniDegistirme {
    public static void main(String[] args) {
        /*
Soru-Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
         */
        List<Integer>list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(15);
        list.add(34);
        list.add(43);

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)==15){
                list.set(i,51);
            }
        }
        System.out.println("list = " + list);
    }
}
