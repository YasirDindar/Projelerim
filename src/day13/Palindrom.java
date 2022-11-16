package day13;

public class Palindrom {
    /*
    Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
    Bir String, tersi ile aynıysa, buna palindrom denir.
    Örneğin; "anna", "123321" palindromlardır.
     */
    public static void main(String[] args) {
        String kelime ="anna";
        String kontrol ="";

        for (int i = kelime.length()-1; i >=0 ; i--) {
            kontrol += kelime.charAt(i);
        }
        if (kontrol.equalsIgnoreCase(kelime)){
            System.out.println("Girilen kelime palindrom kelimedir");
        }else {
            System.out.println("Girilen kelime palindrom kelime degildir");
        }
    }
}
