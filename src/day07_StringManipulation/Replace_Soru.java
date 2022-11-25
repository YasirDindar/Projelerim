package day07_StringManipulation;

public class Replace_Soru {
    public static void main(String[] args) {
        /*
        Soru :Kullanıcının girdiği metinde harf dışında kalan tüm karakterleri
        temizleyen bir kod yazın.
        NOT: space silinmemeli.
         */
        String input = "Ja5+va  cok 1*guzel";
        input = input.replaceAll("\\d","");//Ja+va cok *guzel
        input=input.replace(" ","5");//Ja+va5cok5*guzel
        input = input.replaceAll("\\W","");//Java5cok5guzel
        input=input.replace("5"," ");//Java  cok guzel
        input=input.replaceAll("\\s+"," ");//fazla olan bir boşluğu siler.
        System.out.println(input);
    }
}
