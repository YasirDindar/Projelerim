package day30_Constructor;

public class Araba {

    String marka = "Marka Belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit = "Yakit belirtilmedi";
    int yil;
    int fiyat;

    @Override
    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka :" + marka +
                "\nmodel :" + model +
                "\nyakit :" + yakit +
                "\nyil :" + yil +
                "\nfiyat :" + fiyat ;}

    public int maxHiz(String yakit){
        int maxHiz = 120;
        if (yakit.equalsIgnoreCase("Dizel")){
            maxHiz =200;
        } else if (yakit.equalsIgnoreCase("Benzin")) {
            maxHiz = 230;
        } else if (yakit.equalsIgnoreCase("Elektrikli")) {
            maxHiz=180;
        }
        return  maxHiz;
    }
}
