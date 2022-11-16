package day13;

public class IstenmeyenKarakterleriSilme {
/* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
   Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise
   bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem
*/
    public static void main(String[] args) {
        String input = "goat";

        if ((input.charAt(0)=='g' || input.charAt(0)=='G') && (input.charAt(1)=='h' || input.charAt(1)=='H' )){
            input = input.substring(0);
            if (input.equalsIgnoreCase(String.valueOf(input.charAt(0)=='g')) && (!(input.equalsIgnoreCase(String.valueOf(input.charAt(0)=='h'))))){
                input = input.substring(0,1).concat(input.substring(2));
            } else if (!(input.equalsIgnoreCase(String.valueOf(input.charAt(0)=='g')) && (input.equalsIgnoreCase(String.valueOf(input.charAt(0)=='h'))))) {
                input = input.substring(1);
            }
        }else {
            input = input.substring(2);
        }
        System.out.println(input);
    }
}
