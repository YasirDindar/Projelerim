package day16;

public class MukemmelSayi {
    /*
      Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        //Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
        //herhangi bir sayı Mükemmel Sayı olarak bilinir.
        //Input :6
        //Output:6 Mukemmel Sayidir.
        //======================
        //Input7
        //Output:   7 Mukemmel Sayi degildir.
     */
    public static void main(String[] args) {
        int pozitifBolenToplami = 0;
        int sayi = 6;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                pozitifBolenToplami += i;
            }
        }if (pozitifBolenToplami==sayi){
            System.out.println(sayi + " sayisi mukemmel .");
        }else {
            System.out.println(sayi + " sayisi mukemmel sayi degildir.");
        }
    }
}
