package day08;

public class ForLoppFaktoriyel {
    //Girilen sayinin faktoriyelini bulunuz
    public static void main(String[] args) {
        int sayi = 10;
        int faktoriyel = 1;
        for (int i = sayi; i >=1 ; i--) {
            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);
    }

}
