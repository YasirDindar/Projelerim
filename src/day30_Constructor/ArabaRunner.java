package day30_Constructor;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
            arb1.marka = "Audi";
            arb1.model = "A4";
            arb1.yakit = "Dizel";
            arb1.yil = 2007;
            arb1.fiyat = 300000;

        System.out.println(arb1);
    }
}
