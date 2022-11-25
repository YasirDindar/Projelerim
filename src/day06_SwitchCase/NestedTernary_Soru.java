package day06_SwitchCase;

import java.util.Scanner;

public class NestedTernary_Soru {
    /*
    Soru: Kullanicidan bir tamsayi alin.
    Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
    Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi>0){
            System.out.println(sayi%2==0 ? "Cift sayi" : "Cift sayi degil");
        }else {
            System.out.println(sayi<-99 && sayi>-1000 ? "Uc basamakli" : "Uc basamakli degil");
        }
    }
}
