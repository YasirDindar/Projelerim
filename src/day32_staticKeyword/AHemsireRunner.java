package day32_staticKeyword;

public class AHemsireRunner {
    public static void main(String[] args) {
        AHemsire h1 = new AHemsire();
        h1.personelIsmi="Ayse";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="312652231";
        System.out.println("h1 : "+ h1);

        AHemsire h2 = new AHemsire();
        h2.personelIsmi="Hatice";
        h2.personelAdresi="Kizilay";
        h2.personelTelefon="332854796";

        h2.bashekimIsmi="Yasar Kemal";


        System.out.println("h1 : "+h1);
        System.out.println("h2 : "+h2);

        AHemsire h3 = new AHemsire();
        System.out.println("h3 : "+h3);
        h3.hastaneIsmi="Java Hastanesi";

        System.out.println(h2.hastaneIsmi);
    }
}
