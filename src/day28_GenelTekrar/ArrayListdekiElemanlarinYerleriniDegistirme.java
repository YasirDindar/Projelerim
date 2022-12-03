package day28_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class ArrayListdekiElemanlarinYerleriniDegistirme {
    public static void main(String[] args) {
        /*
Soru-Create a 10-element list.
Swap the 8th element with the 3rd element.
INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
Output:  [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
         */
        List<String>isimler = new ArrayList<>();
        isimler.add("Umit");
        isimler.add("Emin");
        isimler.add("Kemal");
        isimler.add("Kerem");
        isimler.add("Taylan");
        isimler.add("Orhan");
        isimler.add("Sinan");
        isimler.add("Furkan");
        isimler.add("Ahmet");
        isimler.add("Ali");

        String bosKova = isimler.get(2);
        isimler.set(2,isimler.set(7,bosKova));
        System.out.println(isimler);
    }
}
