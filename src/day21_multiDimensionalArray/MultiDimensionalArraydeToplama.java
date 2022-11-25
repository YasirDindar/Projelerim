package day21_multiDimensionalArray;

public class MultiDimensionalArraydeToplama {
    public static void main(String[] args) {
        int [][]arr = {{1,3,4},{2,6,8},{},{2},{4,5}};
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println("İki katli arrayde yer alan elementlerin toplami : " + toplam);
    }
}
