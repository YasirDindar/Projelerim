package day29_GenelTekrar;

public class ArrayIlkSonKarakterleriAyniOlanlariYazdirma {
    public static void main(String[] args) {
        //Soru 10 :İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
        String [] isimler = {"lale","mahmut","ali","kazim","latife","mehmet","abdulbaki"};
        arama(isimler);
    }
    public static void arama(String[]names){
        for (int i = 0; i <names.length ; i++) {
            for (int j = i+1; j < names.length ; j++) {
                if (names[i].substring(0,1).equalsIgnoreCase(names[j].substring(0,1)) && names[i].
                        substring(names[i].length()-1).equalsIgnoreCase(names[j].substring(names[j].length()-1))){
                    System.out.println(names[i]+" "+names[j]);
                }
            }
        }
    }
}
