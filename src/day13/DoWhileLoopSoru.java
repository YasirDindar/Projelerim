package day13;

public class DoWhileLoopSoru {
    /*
   Soru-Kullanicidan bir pozitif sayi isteyin,
   sayının tam kare olup olmadığını bulunuz,
   tamkare ise true değilse false yazdırınız.
   Ornek : input : 16, output: 4
     */
    public static void main(String[] args) {
        int input = 49;
        int baslangic = 1;
        int bayrak = 0;

        do{
            if (baslangic*baslangic==input){
                System.out.println("true");
                bayrak++;
                break;
            }
            baslangic++;
        }while (baslangic*baslangic<=input);

        if (bayrak==0){
            System.out.println("false");
        }
    }
}
