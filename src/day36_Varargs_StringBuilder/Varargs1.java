package day36_Varargs_StringBuilder;

public class Varargs1 {
    public static void main(String[] args) {
        topla(13,12);
        topla(11,9,20);
        topla(20,22,21,31);

        /*
        parametre sayisi degistice yeni method olusturmak zorunda kaliyoruz
        bu yuzden java bize varargs ozelligini sunuyor
         */


    }public static void topla(int sayi1, int sayi2, int sayi3, int sayi4){
        System.out.println("4 sayinin toplami : "+ (sayi1+sayi2+sayi3+sayi4));
    }
    public static void topla(int sayi1, int sayi2, int sayi3){
        System.out.println("3 sayini toplami : "+ (sayi1+sayi2+sayi3));
    }
    public static void topla(int sayi1, int sayi2){
        System.out.println("2 sayini toplami : "+ (sayi1+sayi2));
    }
}
