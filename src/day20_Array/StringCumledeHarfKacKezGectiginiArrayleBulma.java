package day20_Array;

import java.util.Arrays;

public class StringCumledeHarfKacKezGectiginiArrayleBulma {
    public static void main(String[] args) {
        //verilen string de kac tane e harfi oldugunu bulunuz
        String cumle = "Gecmis olsun Duzce, gecmis olsun Turkiye";
        String [] eArrayi = cumle.split("e");
        System.out.println(Arrays.toString(eArrayi));
        System.out.println("Cumlede gecen 'E' sayisi : " +(eArrayi.length));
    }
}
