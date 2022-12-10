package day34_ImmutableClasses_StringPool;

public class UmmitableString {
    public static void main(String[] args) {
        String str = "Java candir";
        str = str.toUpperCase();
        System.out.println(str);

        /*
        Ummitable classlardan olusturulan bir objenin degeri degistirilemez
        eger atama yaparsak java degerini degistirmez
        bunun yerine yeni bir obje olusturur
        ve bu objeye yeni atadigimiz degerini atar.

        eski obje bosa cikar ve garbage collector tarafından silinmeyi bekler.
         */
    }
}
