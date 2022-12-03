package day28_GenelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListtenIstenmeyenKarakteriCikarma {
    public static void main(String[] args) {
        /*
Soru-* Write a program that deletes the letters 'a' from the names in the list given		 * as input.
*INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
*OUTPUT :  [Veli,Omer]
         */
        List<String>isimler1 = new ArrayList<>();
        List<String>isimler2 = new ArrayList<>();

        isimler1.add("Ali");
        isimler1.add("Veli");
        isimler1.add("Ayse");
        isimler1.add("Fatma");
        isimler1.add("Omer");

        for (int i = 0; i <isimler1.size() ; i++) {
            if (!(isimler1.get(i).contains("A") || isimler1.get(i).contains("a"))){
                isimler2.add(isimler1.get(i));
            }
        }
        System.out.println(isimler2);
    }
}
