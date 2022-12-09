package day33_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class PassByValueList {
    public static void main(String[] args) {
        /*
        bir method olusturalim ve method da list'deki sayilari 5 artiralim.
        Method'da listenin son halini yazdiralim.
         */
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementleri5artir(sayilar);//[15, 25, 35]
        elementleri5artir(sayilar);//[20, 30, 40]

        System.out.println(sayilar);//[20, 30, 40]

        /*
        List ve Array'ler methodda olan degisiklikleri de kaydederler.
        Eger degisikliklerin kaydolmasini istemezsek baska bir array veya list olusturmaliyiz.
         */
    }public static void elementleri5artir(List<Integer>sayilar){
        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.set(i,sayilar.get(i)+5);
        }
        System.out.println(sayilar);
    }
}
