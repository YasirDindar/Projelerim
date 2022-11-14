package day11;

public class MethodOlusturmaStringTersCevirme {
    public static void main(String[] args) {
         /*
        parametre olarak bir String kabul edip
        Stringin terse cevrilmis halini donduren bir method olusturalım
        */
        String str = "Java kod yazdikca ogrenilir.";
        System.out.println(terseCevirme(str));
    }
    public static String terseCevirme(String str){
        String tersStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr +=str.charAt(i);
        }
        return  tersStr;
    }
}
