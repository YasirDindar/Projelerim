package day13_DoWhileLoop;

public class StringdeElemanArama {
    /*
     girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     input      output
     axyzm  ==   true
     xyz    ==   true
     x.yz   ==   false
     xyaz   ==   false
     */
    public static void main(String[] args) {
        String str = "Bugunxyzkasimayinin 16.gunu";
        boolean iceriyorMu = false;

        if (str.contains("xyz")){
            iceriyorMu = true;
        }else {
            iceriyorMu = false;
        }
        System.out.println(iceriyorMu);
    }
}
