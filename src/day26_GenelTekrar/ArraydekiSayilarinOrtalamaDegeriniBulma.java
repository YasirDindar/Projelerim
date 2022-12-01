package day26_GenelTekrar;

public class ArraydekiSayilarinOrtalamaDegeriniBulma {
    public static void main(String[] args) {
        /*
* Write a java program that calculates the average value of array elements
*
* input[]= {1,2,3,4,5,6,7}
*
* Ou
* Dizi elemanlarının ortalama değerini hesaplayan bir java programı yazınız
*
* giriş[]= {1,2,3,4,5,6,7}
*
* Çıkış : 4
         */
        int [] sayilar = {1,2,3,4,5,6,7,8};
        int ortalama = 0;
        int toplam = 0;

        for (int i = 0; i <sayilar.length ; i++) {
            toplam += sayilar[i];
        }
        ortalama = toplam/sayilar.length;
        System.out.println("Ortalama : "+ortalama);
    }
}
