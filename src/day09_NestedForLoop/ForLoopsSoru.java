package day09_NestedForLoop;

import java.util.Scanner;

public class ForLoopsSoru {
    /*
    Soru-Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
    -3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
    -5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
    -hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pozitif sayi giriniz : ");
        int sayi = scan.nextInt();

        for (int i = 0; i <=sayi ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("FizzBuzz\n");
            } else if (i%3==0) {
                System.out.print("Fizz ");
            } else if (i%5==0) {
                System.out.print("Buzz ");
            }else {
                System.out.print(i+ " ");
            }
        }
    }
}
