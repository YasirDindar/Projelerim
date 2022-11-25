package day14_StringManipulationSoru;

public class ArmstrongSayi {
    /*
    Check if the integer is an Armstrong numbers
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir

               153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
               370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
     */
    public static void main(String[] args) {
        int sayi = 153 ;

        int yuzlerBasamagi = sayi%10;
        sayi = sayi/10;
        int onlarBasamagi = sayi%10;
        sayi = sayi/10;
        int birlerBasamagi = sayi%10;

        sayi = (sayi*100) + (onlarBasamagi*10) + (yuzlerBasamagi);

        int kontrol = (yuzlerBasamagi*yuzlerBasamagi*yuzlerBasamagi)+
                      (onlarBasamagi*onlarBasamagi*onlarBasamagi)+
                      (birlerBasamagi*birlerBasamagi*birlerBasamagi);

        if (sayi==kontrol){
            System.out.println("Amstrong sayi");
        }else {
            System.out.println("Amstrong sayi degil");
        }
    }
}
