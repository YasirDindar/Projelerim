package day29_GenelTekrar;

public class ArrayEnUzunKisaElemaniBulma {
    public static void main(String[] args) {
        /*
Soru: String’ lerden oluşan bir arrayde uzunluğu en kisa ve en uzun  olan elemanları bulunuz.
Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Jonathan
         */
        String [] arr = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        String enKisaKelime = arr[0];
        String enUzunKelime = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i].length()>enUzunKelime.length()){
                enUzunKelime = arr[i];
            }
            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime = arr[i];
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);
        System.out.println("enKisaKelime = " + enKisaKelime);
    }
}
