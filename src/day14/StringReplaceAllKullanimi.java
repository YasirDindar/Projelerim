package day14;

public class StringReplaceAllKullanimi {
    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {
        String cumle = "Java ogrenmek123 Cok guzel@"; //Java ogrenmek cok guzel

        cumle = cumle.replaceAll("\\d",""); //Java ogrenmek Cok guzel@
        cumle = cumle.replace("@","");//Java ogrenmek Cok guzel
        cumle = cumle.replace("C","c");//Java ogrenmek cok guzel
        System.out.println(cumle);
    }
}
