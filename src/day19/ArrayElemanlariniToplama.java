package day19;

public class ArrayElemanlariniToplama {
    /*
Soru-Verilen bir array’deki pozitif tamsayilari toplayip
sonucu bize donduren bir method yaziniz.
     */
    public static void main(String[] args) {
        int[]arr = {3,5,-6,1,-3,2,7};

        System.out.println(pozitifElementleriTopla(arr));

    }public static int pozitifElementleriTopla(int[]arr){
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam += arr[i];
            }
        }
        return toplam;
    }
}
