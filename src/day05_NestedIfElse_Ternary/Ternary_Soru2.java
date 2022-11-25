package day05_NestedIfElse_Ternary;

public class Ternary_Soru2 {
    /*
    İki string ifadeyi ternary ile karsilastiriniz.
    İkisi de ayni ise "metinler ayni" farkli ise "metinler farkli" yazdirin
      */
    public static void main(String[] args) {
        String cumle1 = "Yasir";
        String cumle2 = "yasir";
        System.out.println(cumle1.equals(cumle2)? "metinler ayni" : "metinler farkli");
    }


}
