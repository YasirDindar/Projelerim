package day02;

public class ConcanationKullanma {
    public static void main(String[] args) {
        //Asagida verilen variable'lari kullanarak istenen degerleri yazdiralim.

        String str1 = "Hava";
        String str2 = "Yagmurludur";
        String str3 = "";
        String str4 = " ";
        int sayi1 = 5;
        int sayi2 = 11;

        // Hava5 11Yagmurludur  ==>  verilen degeri yazalim.
        System.out.println(str1+sayi1+str4+sayi2+str2); //Hava5 11Yagmurludur
        // 511Yagmurludur Hava
        System.out.println(sayi1+str3+sayi2+str2+str4+str1);//511Yagmurludur Hava
        //Hava yagmurludur16
        System.out.println(str1+str4+str2+(sayi1+sayi2));//Hava Yagmurludur16
        //16Hava yagmurludur
        System.out.println(sayi1+sayi2+str1+str4+str2);//16Hava Yagmurludur
    }
}
