package day09_NestedForLoop;

public class NestedForLoopDikdortgenBirSekilOlusturma {
    /*
    Asagidaki sekli yazdiran bir kod hazirlayin.

        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
     */
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
