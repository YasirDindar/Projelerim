package day32_staticKeyword;

public class PassByValue {
    public static void main(String[] args) {
        int fiyat =100;
        System.out.println(indirimUygula(fiyat));
        /*
        java pass by value'dur.
        Bu ornekte oldugu gibi main methodda bir fiyat atamasi yaptik.
        indirimuygula adli bir method olusturduk ve bu fiyata indirim uyguladik.
        Ancak bu methodu kac kez cagirirsak da bu urun 100 tl uzerinden indirim uygular
        Yani her indirim uygulamasinin ardindan bir indirim daha uyguladigimizda o indirim uzerinden
        indirim yapmaya devam etmez.
         */
        System.out.println(fiyat);

    }public static double indirimUygula(double fiyat){
        //%10 indirim yapalim
        fiyat *= 0.9; //fiyata atama yaptik. kalici olarak 90 oldu
        return  fiyat;
    }
}
