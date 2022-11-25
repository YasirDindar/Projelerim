package day14_StringManipulationSoru;

public class StringIfadeyiMethodlaTersYazdirma {
    //Girilen bir String'i tersten yazdiran bir pr create ediniz
    public static void main(String[] args) {
        String str = "Java kod yazdikca guzellesiyor";

        stringiTersYazdirma(str);
    }

    private static void stringiTersYazdirma(String str) {
        String tersStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr += str.substring(i,i+1);
        }
        System.out.println(tersStr);
    }
}
