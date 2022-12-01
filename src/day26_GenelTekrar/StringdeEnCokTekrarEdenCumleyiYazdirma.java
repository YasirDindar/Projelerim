package day26_GenelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringdeEnCokTekrarEdenCumleyiYazdirma {
    public static void main(String[] args) {
       /*
* Write a Java program to get a String from user as input and find the maximum
* occurring character in that string.(Ignore case sensitivity).
*
* Input : Learning java is easy
*
* Output: maximum occurring character is : a
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        List<String>list = new ArrayList<>();
        int sayac = 0;
        int sayac1 = 0;

        for (int i = 0; i <cumle.length() ; i++) {
            sayac=0;
            for (int j = i+1 ; j <cumle.length() ; j++) {
                if (cumle.toLowerCase().charAt(i)== cumle.toLowerCase().charAt(j)){
                    sayac++;
                }
            }
            if (sayac>sayac1){
                sayac1=sayac;
                list.add(cumle.substring(i,i+1));
                if (list.size()==2){
                    list.remove(0);
                }
            }
        }
        System.out.println("maximum occurring character is :"+ list.get(0).toLowerCase());
    }
}
