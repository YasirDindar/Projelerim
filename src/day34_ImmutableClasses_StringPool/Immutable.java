package day34_ImmutableClasses_StringPool;

public class Immutable {
    public static void main(String[] args) {
        // bu kod calistiginda Java kac obje olusturur

        String str = "Ali";

        for (int i = 0; i <10 ; i++) {
            str +=".";
        }
        System.out.println(str);//Ali..........
    }
}
