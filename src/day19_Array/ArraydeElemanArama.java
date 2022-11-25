package day19_Array;

public class ArraydeElemanArama {
    /*
    Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
    ve varsa kac kere kullanildigini yazdiran bir method olusturun.
    */
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 6, 5, 8, 9, 7};
    int arananEleman = 3;
    arananElementMethodu(arr,arananEleman);
    }public static void arananElementMethodu(int[]arr,int arananElement){
        int sayac = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananElement){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Aranan element array'de yok.");
        }else {
            System.out.println("Aranan "+arananElement + " sayisi array de "+sayac + " kere kullanilmistir.");
        }
    }
}
