package day04;

import java.util.Scanner;

public class IfElseIf_MusteriKartiSorusu {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac adet urun aldiniz ?");
        int urunAdedi = scan.nextInt();
        System.out.println("Urunun Liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();
        double toplamFiyat =0;
        boolean kartVarMi = true;

       if (kartVarMi && urunAdedi>=10){//kart var ve 10'dan fazla urun alinmis
       toplamFiyat += urunAdedi*listeFiyati*(0.8);  //%20 indirim uygulandi
           System.out.println("%20 indirimli toplam fiyati :" + toplamFiyat);
       } else if (kartVarMi && urunAdedi>0 && urunAdedi<10){//kart var ve 10'dan az urun alinmis
       toplamFiyat += urunAdedi*listeFiyati*(0.85);//%15 indirim uygulandi
           System.out.println("%15 indirimli toplam fiyati :" + toplamFiyat);
       } else if (!kartVarMi && urunAdedi>=10){
       toplamFiyat += urunAdedi*listeFiyati*(0.85);
           System.out.println("%15 indirimli toplam fiyati :" + toplamFiyat);
       } else if (!kartVarMi && urunAdedi>0 && urunAdedi<10) {
       toplamFiyat += urunAdedi*listeFiyati*(0.90);
           System.out.println("%10 indirimli toplam fiyati :" + toplamFiyat);
       }else {
           System.out.println("Gecersiz giris");
       }
    }
}
