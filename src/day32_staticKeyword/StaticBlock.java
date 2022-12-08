package day32_staticKeyword;

public class StaticBlock {

    /*
    static blok her kosulda main methoddan once calisir.
    Ayrica bir class'da birden fazla static blok yer alabilir.
    Bu durumda yukardan asagiya dogru giderek static bloklar calisir daha sonra main method calisir.
     */
    static {
        System.out.println("1.static blok calisti.");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
    }static {
        System.out.println("2.statik blok calisti");
    }
}
