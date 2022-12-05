package day29_GenelTekrar;

public class ArraydeBelirtilenElemanlarinBasHarleriniYazdirma {
    public static void main(String[] args) {
        /*
Soru-:String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa,
o öğelerin baş harflerini alınız.
Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JJM

         */
        String [] str = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        String ilkHarf = "";
        for (int i = 0; i < str.length ; i++) {
            if (str[i].endsWith("n") || str[i].endsWith("k")){
                ilkHarf += str[i].substring(0,1);
            }
        }
        System.out.println(ilkHarf);
    }
}
