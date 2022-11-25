package day21_multiDimensionalArray;

public class MDA_ElementleriCarpmaMethodu {
    public static void main(String[] args) {
        int [][]arr = {{2,4},{1,3},{5,6}};

        System.out.println(elementleriCarpmaMethodu(arr));

    }public static int elementleriCarpmaMethodu(int [][]arr){
        int carpim = 1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim *= arr[i][j];
            }
        }
        return carpim;
    }
}