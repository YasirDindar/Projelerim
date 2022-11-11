package day08;

public class ForLoopSoru1 {
    public static void main(String[] args) {
        //1 den baslayarak 10 a kadar (dahil) sayilari yanyana yazdiralim
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i +" ");
        }
        System.out.println("");
        //2 basamakli sayilardan 7 ile bolunenleri yanyana yazdiralim
        for (int i = 0; i <100 ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        //13 den baslayarak ,100 e kadar 7'ser 7'ser artirip yazdiralim.
        for (int i = 13; i <100 ; i+=7) {
            System.out.print(i+" ");
        }
        System.out.println("");
        //1 den 10 'a kadar sinirlar dahil sayilarin karelerini yazdiralim
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i*i+" ");
        }
    }
}
