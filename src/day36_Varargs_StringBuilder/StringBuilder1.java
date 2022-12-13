package day36_Varargs_StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(7);
        // bu kodu yazinca java bize 7 karakter alabilecek StringBuilder olusturur.
        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//0

        /*
         capacity ile lenght arasindaki fark;
         capacity bizim belirledigimiz ya da Javanin bize belirledigi miktarda
         Javanin olusturdugu alandir
         lenght ise bu ayrilan alani degil bizim bu alani ne kadar doldurdugumuzu gosterir
         */
        sb.append("Java");
        System.out.println(sb);//Java
        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//4

        sb.append(" guzeldir");
        System.out.println(sb);//Java guzeldir
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//14

        /*
        belirledigimiz capacity'i astigimiz icin Java yeni alan acar
        7*7+2 = 16
         */

        sb.append(" ona ne suphe");
        System.out.println(sb);//Java guzeldir ona ne suphe
        System.out.println(sb.capacity());//34   16*2+2=34
        System.out.println(sb.length());//26

        // kapasite ve lenght'i esitlemek istersek;
        sb.trimToSize();
        System.out.println(sb.capacity());//26
        System.out.println(sb.length());//26


    }
}
