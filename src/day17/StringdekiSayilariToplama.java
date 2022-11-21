package day17;

public class StringdekiSayilariToplama {
    /*
     * write a method which accepts a String as parameter
     * and prints the sum of the digits, present in the given string
     *
     * Parametre olarak bir String kabul eden ve verilen Stringde
     * bulunan rakamların toplamını yazdiran bir method yazın.
     *
     * Input : ade1r4d3
     * Output : 1+4+3 = 8
     *
     * Use Character.isDigit()
     *     Integer.valueOf()

     */
    public static void main(String[] args) {
        String kelime = "ade1r4d3";
        stringRakamlarToplami(kelime);

    }public static void stringRakamlarToplami(String kelime){
        int toplam = 0;
        for (int i = 0; i <kelime.length() ; i++) {
            if (Character.isDigit(kelime.charAt(i))){
                toplam += Integer.valueOf(""+kelime.charAt(i));
            }
        }
        System.out.println("Rakamlar toplami : "+toplam);
    }
}
