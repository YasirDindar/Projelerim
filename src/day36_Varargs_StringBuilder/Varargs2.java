package day36_Varargs_StringBuilder;

public class Varargs2 {
    public static void main(String[] args) {
        topla();
        topla(13);
        topla(13,12);
        topla(13,12,20);
        topla(13,12,20,22);
        topla(13,12,20,22,11);

        /*
        bir method da parametre sayisini sinirlandirmak istemezsek standart bir variable
        yerine vararhs kullaniriz

        Varargs data turunun yanina 3 nokta konularak deklare edilir
        int... => sayisi belirli olmayan int parametreler alan bir arraydir
         */


    }public static void topla(int...sayilar){
        int toplamSonuc =0;
        for (int each:sayilar) {
            toplamSonuc += each;
        }
        System.out.println("Girilen sayilarin toplami : " + toplamSonuc);
    }
}
