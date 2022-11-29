package day24_Array_ArrayList_MDA;

public class MDA_CiftSayilariToplama {
    public static void main(String[] args) {
       /*
Soru-Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir method olusturun.
        */
        int [][]arr = {{1,2,3},{1,3,5},{2,4,6}};
        ciftKatmanliArraydeCiftSayilariToplama(arr);

    }public static void ciftKatmanliArraydeCiftSayilariToplama(int [][]arr){
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    toplam += arr[i][j];
                }
            }
        }
        System.out.println("Multi dimensional Arrayde cift sayilari toplama : " +toplam);
    }
}