package day32_staticKeyword;

public class AHemsire {
    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Cankaya / Ankara";
    static String bashekimIsmi = "Dr Mehmet Yilmaz";

    String personelIsmi = "Isim belirtilmedi";
    String personelAdresi = "Adres belirtilmedi";
    String personelTelefon = "Telefon belirtilmedi";

    @Override
    public String toString() {
        return "AHemsire{" +
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", hastaneIsmi='" + hastaneIsmi + '\'' +
                ", hastaneAdresi='" + hastaneAdresi + '\'' +
                ", bashekimIsmi='" + bashekimIsmi + '\'' +
                '}';
    }
}
