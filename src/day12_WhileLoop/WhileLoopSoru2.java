package day12_WhileLoop;

import java.util.Scanner;

public class WhileLoopSoru2 {
    public static void main(String[] args) {
         /*
        kullanicidan toplanmak uzere sayi alin.
        sayilarin toplami 500 e esit olur veya gecerse

        girilen sayi adedi,
        girilen sayilarin toplami ve
        "Bu kadar yeter"yazdirin.
          */
        Scanner scan = new Scanner(System.in);
        double sayi = 0;
        double toplam = 0;
        int sayac =0;

        while (toplam<500){
            System.out.println("Toplamak icin sayi giriniz");
            sayi = scan.nextDouble();
            toplam +=sayi;
            sayac++;
        }
        System.out.println("Girilen "+sayac + " sayinin toplami : " + toplam+ " oldu.Bu kadar yeter");
    }
}
