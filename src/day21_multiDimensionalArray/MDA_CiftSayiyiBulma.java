package day21_multiDimensionalArray;

public class MDA_CiftSayiyiBulma {
    public static void main(String[] args) {
        //verilen iki katli bir int array'deki cift sayi adedini bulan kod yaziniz.

        int [][]arr = {{4,8},{3,6},{7,9,3}};

        int sayac = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    sayac++;
                }
            }
        }
        System.out.println("Arraydeki cift sayi adedi : "+sayac);
    }
}
