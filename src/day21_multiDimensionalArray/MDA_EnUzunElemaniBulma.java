package day21_multiDimensionalArray;

public class MDA_EnUzunElemaniBulma {
    public static void main(String[] args) {
//verilen multidimensional String bir array'deki en uzun Stringi bulan kod yaziniz.
    String [][] arr = {{"Yasir","Hafsa"},{"Ubeyde","Hüma","Huzeyfe"}};

    String enUzunKelime = arr[0][0];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j].length()>enUzunKelime.length()){
                    enUzunKelime = arr[i][j];
                }
            }
        }
        System.out.println(enUzunKelime);
    }
}
