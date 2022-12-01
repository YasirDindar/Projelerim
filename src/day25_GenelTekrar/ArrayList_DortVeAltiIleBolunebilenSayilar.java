package day25_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_DortVeAltiIleBolunebilenSayilar {
    public static void main(String[] args) {
        /*
120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız
         */
        List<Integer>dortIleBolunenSayilar = new ArrayList<>();
        List<Integer>altiIleBolunenSayilar = new ArrayList<>();

        for (int i = 11; i <=120 ; i++) {
            if (i%4 ==0){
                dortIleBolunenSayilar.add(i);
            }
            if ((i%6) == 0){
                altiIleBolunenSayilar.add(i);
            }
        }
        System.out.println("Dort ile bolunen sayilar : "+dortIleBolunenSayilar+
                            "\nalti ile bolunen sayilar : "+altiIleBolunenSayilar);
    }
}
