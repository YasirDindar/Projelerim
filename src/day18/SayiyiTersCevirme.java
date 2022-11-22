package day18;

public class SayiyiTersCevirme {
    /*
     * Interview questions…
     *
     * write a return method to reverse number
     *
     * Input : 12345 Output : 54321
     */
    public static void main(String[] args) {
        int sayi = 12345;
        System.out.println("sayiyiTersCevirme(sayi) = " + sayiyiTersCevirme(sayi));

    }public static int sayiyiTersCevirme(int sayi){
        int tersSayi = 0;
        while (sayi>0){
            tersSayi = sayi%10 + tersSayi*10;
            sayi /=10;
        }
        return tersSayi;
    }
}
