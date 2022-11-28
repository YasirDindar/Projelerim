package ders23_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrtalamaninUstundekiNotSayisi {
    public static void main(String[] args) {
        /*
ogretmenden ogrenci notlarni alip bir list olusturun.
ogretmen 100 'den buyuk rakam girdiginde bitir.
sinif sayisini, sinif ortalamasini ve kac kisinin ortalamasinin ustunde not aldigini yazdirin.
         */
        List<Double>notlar = ListeOlustur();
        System.out.println(notlar);

        raporla(notlar);
    }

    public static void raporla (List<Double> notlar) {
        int ogrenciSayisi = notlar.size();
        double notlarToplami = 0.0;
        double sinifNotOrtalamasi = 0.0;
        int ortalamaUstundekiOgrenciSayisi = 0;

        for (int i = 0; i <notlar.size() ; i++) {
            notlarToplami += notlar.get(i);
        }
        sinifNotOrtalamasi = notlarToplami/ogrenciSayisi;
        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i)>sinifNotOrtalamasi){
                ortalamaUstundekiOgrenciSayisi++;
            }
        }
        System.out.println("Girilen not sayisi : "+ogrenciSayisi+
                           "\nGirilen notlarin ortalamasi : "+sinifNotOrtalamasi+
                           "\nOrtalama uzerinde not alan ogrenci sayisi : "+ortalamaUstundekiOgrenciSayisi);
    }
    public static List<Double>ListeOlustur(){
        List<Double>notlar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Double girilenNot = 5.0;
        while (girilenNot<=100){
            System.out.println("Lutfen listeye eklemek icin not giriniz "+
                                "\nBitirmek icin 100'den buyuk bir sayi girisi yapiniz");

            girilenNot = scan.nextDouble();
            if (girilenNot<=100){
                notlar.add(girilenNot);
            }
        }
        return notlar;
    }
}
