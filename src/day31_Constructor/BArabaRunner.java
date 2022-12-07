package day31_Constructor;

public class BArabaRunner {
    public static void main(String[] args) {

        BAraba arb1 = new BAraba();
        arb1.marka = "Citroen";
        arb1.model = "C3";
        arb1.yakit = "Benzin";
        arb1.yil = 2020;
        arb1.fiyat = 20000;
        System.out.println("arb1 = " + arb1);

        BAraba arb2 = new BAraba("Volvo","CX60");
        System.out.println("arb2 = " + arb2);

        BAraba arb3 = new BAraba("Hyundai","i10",10000);
        System.out.println("arb3 = " + arb3);

        BAraba arb4 = new BAraba("Porche","Cayanne","Benzin",1990,12000);
        System.out.println("arb4 = " + arb4);
    }
}
