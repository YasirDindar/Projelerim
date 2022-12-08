package day32_staticKeyword;

public class Deneme {
    int a=10;
    static int b=20;
    String str1="Ali";
    static String st2="Ayse";

    Deneme(){
        str1="Hasan";
        st2+="++";
    }Deneme(int x,int y){
        a=x;
        b=y;
    }

    public static void main(String[] args) {
        Deneme dnm1 = new Deneme(6,8);
        System.out.println(dnm1.b);//8
        Deneme dnm2 = new Deneme(10,12);
        System.out.println(dnm1.b);//12
    }
}
