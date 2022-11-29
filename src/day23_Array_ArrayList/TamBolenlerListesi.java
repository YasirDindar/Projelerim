package day23_Array_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TamBolenlerListesi {
    public static void main(String[] args) {
        //Soru- Girilen pozitif bir tamsayiyi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.

        int sayi = 30;
        System.out.println(tamBolenlerListesiOlustur(sayi));

    }public static List<Integer>tamBolenlerListesiOlustur(int sayi){
        List<Integer>tamBolenlerListesi = new ArrayList<>();
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }
}
