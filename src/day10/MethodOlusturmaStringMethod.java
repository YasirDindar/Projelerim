package day10;

public class MethodOlusturmaStringMethod {
    //verilen iki stringi parametre olarak kabul edip bu iki stringi aralarında bir bosluk olan
    // tek bir string olarak main methoda donduren bir method olusturun
    public static void main(String[] args) {
        String str1 = "Kod";
        String str2 = "Yazmak";
        System.out.println(birlestirmeMethodu(str1, str2));
    }public static String birlestirmeMethodu(String str1,String str2){
        return str1+" "+str2;
    }
}
