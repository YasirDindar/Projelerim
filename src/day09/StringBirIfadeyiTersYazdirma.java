package day09;

public class StringBirIfadeyiTersYazdirma {
    //Soru -Kullanicidan bir String isteyin ve String’i tersten yazdirin.
    public static void main(String[] args) {
        String input = "Java ogrenmek cok guzel";
        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
