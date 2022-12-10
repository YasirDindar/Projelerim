package day34_ImmutableClasses_StringPool;

public class StringPool2 {
    public static void main(String[] args) {
        String a ="";
        a += 2;
        a += 'c';
        a += false;

        if (a=="2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equels");
    }
}
