package day33_PassByValue;

public class PassByValue {
    public static void main(String[] args) {
        double fiyat = 100;
        System.out.println(indirimUygula(fiyat));//90.0
        System.out.println(indirimUygula(fiyat));//90.0

        System.out.println(fiyat);//100

        fiyat = indirimUygula(fiyat);
        //main methoddaolusturdugumuz indirim islemini kalici olarak atadik.
        System.out.println(fiyat);//90.0

    }public static double indirimUygula(double fiyat){
        fiyat *= 0.9;
        return fiyat;
    }
}
