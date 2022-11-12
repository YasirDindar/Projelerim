package day09;

public class StringBirIfadeyiTersCeviripKaydetme {
    //Soru 10 (interview)- Kullanicidan bir String isteyin ve Stringi tersine cevirip kaydedin.
    public static void main(String[] args) {
        String input = "Java ogrenmek cok guzel";
        String tersInput = "";

        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println("Stringin ters hali : "+tersInput);
    }
}
