package day26_GenelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListtenIstenmeyenSayiyiSilme {
    public static void main(String[] args) {
        /*
* Kullanıcıdan bir sayı isteyin, input olan array de bu sayiyi silip diğer
* array elemanlarını baska bir listeye atayan ve bu listeyi console yazdıran bir method yazın
*
* Input :[1,2,3,4,5,6]
*
* element:6
*
* Output : [1,2,3,4,5]
         */
        Scanner scan = new Scanner(System.in);
        int []sayilar = {1,2,3,4,5,6};
        System.out.println("Listede yer alan rakamdan hangisini silmek istersin ?");
        Integer silinecekEleman = scan.nextInt();
        List<Integer>liste = new ArrayList<>();

        for (int i = 0; i <sayilar.length ; i++) {
            liste.add(sayilar[i]);
            liste.remove(silinecekEleman);
        }
        System.out.println(liste);
    }
}
