package day27_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class StringArrayDigitIfadeleriToplama {
    public static void main(String[] args) {
        /*
SORU-String bir listede verilen tüm fiyatların toplamını bulunuz.
Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
         */
        List<String>myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");

        double toplam = 0;

        for (String sayi:myList) {
            sayi = sayi.replace("$","");
            toplam += Double.parseDouble(sayi);
        }
        System.out.println("toplam = " + toplam);
    }
}
