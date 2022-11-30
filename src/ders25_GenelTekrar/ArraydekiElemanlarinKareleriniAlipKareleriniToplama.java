package ders25_GenelTekrar;

public class ArraydekiElemanlarinKareleriniAlipKareleriniToplama {
    public static void main(String[] args) {
        /*
Soru-Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
yazdiran bir method olusturun.
         */

        arrayElementlerinKarelerininToplami();
    }public static void arrayElementlerinKarelerininToplami(){
        int [] arr = {2,3,5};

        arrayHerElemaninKaresiniToplama(arr);
    }public static void arrayHerElemaninKaresiniToplama(int []arr){
        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i]*arr[i];
        }
        System.out.println(toplam);
    }
}
