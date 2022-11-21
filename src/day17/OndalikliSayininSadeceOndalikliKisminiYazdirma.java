package day17;

import java.util.Scanner;

public class OndalikliSayininSadeceOndalikliKisminiYazdirma {
       /* Soru -1- Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
isaretiyle yazdırmak !ç!n gereken kodu yazınız.
Örnegin; 75.4238 ´ *4*2*3*8
*/
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("Lutfen ondalikli bir sayi giriniz");
           double sayi = scan.nextDouble();
           String str = ""+sayi;
           str = str.substring(str.indexOf(".")+1);
           for (int i = 0; i <str.length() ; i++) {
               System.out.print("*"+str.charAt(i));
           }
       }
}
