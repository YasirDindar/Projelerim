package day22_MultiDimensionalArray_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KullaniciyaArrayListOlusturma {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(listeOlusturma());
    }
    public static List<String>listeOlusturma(){
        List<String>isimler = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String girilenIsim = "";
        while (!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("Lutfen listeye eklemek icin isim giriniz\n"+
                                "Bitirmek icin q ya basiniz");
            girilenIsim = scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }

        }
        return  isimler;
    }
}
