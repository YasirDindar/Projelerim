package day19_Array;

public class ArrayEnUzunEnKisaKelime {
    //Soru-Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
    public static void main(String[] args) {
        String []arr = {"Cihat","Muhammed","Ömer","Ali"};
        enUzunEnKisaIsimleriYazdirma(arr);

    }public static void enUzunEnKisaIsimleriYazdirma(String[]arr){
        String enUzunKelime = arr[0];
        String enKisaKelime = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length()>= enUzunKelime.length()){
                enUzunKelime = arr[i];
            }
            if (arr[i].length()<= enKisaKelime.length()){
                enKisaKelime = arr[i];
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);
        System.out.println("enKisaKelime = " + enKisaKelime);
    }
}
