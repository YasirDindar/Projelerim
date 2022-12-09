package day33_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class PassByValueList2 {
    public static void main(String[] args) {
        /*
bir method olusturalim.Method da yeni bir liste olusturun.
Listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin.
sonra sayilar listesine deger olarak yeni listi atayin ve sayilar listini yazdirin.
         */
        List<Integer>sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);//[15, 25, 35]
        System.out.println(sayilar);//[10, 20, 30]

        /*
        Method da yeni bir list olusturdugumuz icin sadece main methodda
        cagirdigimiz zaman elementleri artirdigini goruyoruz.
        Ancak listi tekrar cagirdigimiz zaman listin guncellenmedigini goruyoruz
         */

    }public static void yeniListDegeriAta(List<Integer>sayilar){
        //once yeni bir list olusturalim
        List<Integer>yeniList = new ArrayList<>();
        //l,steye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin.
        for (int i = 0; i <sayilar.size() ; i++) {
            yeniList.add(sayilar.get(i)+5);
        }
        //yeni olusturdugumuz listi eski liste atayalim.
        sayilar=yeniList;
        System.out.println(sayilar);
    }
}
