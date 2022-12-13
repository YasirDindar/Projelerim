package day36_Varargs_StringBuilder;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java candir. ");
        System.out.println(sb.capacity());//16+12=28
        System.out.println(sb.length());//12

        /*
         StringBuilder da biz kapasite belirlemedigimiz zaman Java bize 16 boyutunda alan acar
         bu alana bizim girecegimiz string ifadenin uzunlugu kadar alan genisler
         */
        System.out.println(sb.reverse());// ridnac avaJ
        System.out.println(sb.reverse());//Java candir

        //StringBuilder da reverse methodu string ifadeyi ters cevirir ve
        //StringBuilder oldugu icin kalici olarak atar.

        sb.replace(0,4,"Selenium");
        System.out.println(sb);//Selenium candir

        // replace methodu belirledigimiz alani siler ve belirledigimiz alana eklememizi yapar

        sb.insert(16,"bu bir yalandir");//Selenium candir bu bir yalandir
        System.out.println(sb);

        String str = "Java cok guzel";
        sb.insert(19,str,9,14);
        System.out.println(sb);//Selenium candir.bu guzelbir yalandir

        System.out.println(sb.substring(4));//nium candir.bu guzelbir yalandir
        System.out.println(sb.insert(0,"A"));//ASelenium candir.bu guzelbir yalandir
    }

}
