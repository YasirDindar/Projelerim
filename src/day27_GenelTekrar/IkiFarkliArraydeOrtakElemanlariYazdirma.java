package day27_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class IkiFarkliArraydeOrtakElemanlariYazdirma {
    public static void main(String[] args) {
        /*
 2 farklı array deki aynı isimleri console yazdıran bir java programı yazın.
(without case sensitivity)
Input1 : {John,Brad,Ange,Sofia,Emily}
Input2 : {sofia,brad,grace,emily,hazel}
Output : [sofia,brad,emily]
         */
        String [] isimler1 = {"Yasir","Hafsa","Ubeyde","Talha","Burak","Huzeyde","Hüma"};
        String [] isimler2 = {"ubeyde","talha","yasar","muhammed","abdullah","batuhan","hafsa"};

        List<String>isimlerListesi1 = new ArrayList<>();
        List<String>isimlerListesi2 = new ArrayList<>();
        List<String>isimlerListesi3 = new ArrayList<>();

        for (int i = 0; i <isimler1.length ; i++) {
            isimlerListesi1.add(isimler1[i]);
        }

        for (int i = 0; i <isimler2.length ; i++) {
            isimlerListesi2.add(isimler2[i]);
        }
        for (int i = 0; i <isimlerListesi1.size() ; i++) {
            for (int j = 0; j <isimlerListesi2.size() ; j++) {
                if (isimlerListesi1.get(i).equalsIgnoreCase(isimlerListesi2.get(j))){
                    isimlerListesi3.add(isimlerListesi2.get(j));
                }
            }
        }
        System.out.println(isimlerListesi3);
    }
}
