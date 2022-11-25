package day21_multiDimensionalArray;

public class MDA_SonElementleriToplamaMethodu {
    public static void main(String[] args) {
     /*
Soru 5- Verilen 2 katli bir array’de
her bir inner array’in son elementlerinin toplaminini yazdiran bir method olusturun.
      */
        int [][]arr = {{2,8},{1},{5,8,9},{7,5,2,3}};

        sonElementleriTopla(arr);
    }public static void sonElementleriTopla(int [][]arr){
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i][(arr[i].length-1)];
        }
        System.out.println("Inner Arraylerin son elementlerinin toplami : "+ toplam);
    }
}
