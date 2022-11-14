package day11;

public class SubstringMethoduKullanma {
    /*
    Soru-Kullanicidan input olarak verilen bir String alin,
    baslangic ve bitis indexlerine gore baslangic index’i dahil,
    bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
    kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */
    public static void main(String[] args) {
        String input = "Java ne kadar guzel";
        int basIndexi = 5;
        int bitIndexi = 7;
        kendiSubstringMethodumuzuOlusturma(input,basIndexi,bitIndexi);
        kendiSubstringMethodumuzuOlusturma("Substring methodum",5,10);
    }public  static void kendiSubstringMethodumuzuOlusturma(String input,int basIndexi,int bitIndexi){
        if (basIndexi>bitIndexi){
            System.out.println("Baslangic indexi,bitis indexinden buyuk olamaz");
        } else if (bitIndexi>=input.length()) {
            System.out.println("Bitis indexi Stringin sinirlari disinda");
        }else {
            for (int i = basIndexi; i <bitIndexi ; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println("");
        }
    }
}
