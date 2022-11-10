package day07;

public class StringManipulation_MailKontrolu {
     /*
        mail kontrolu yapan bir program hazırlayın.
        1-mail@ işareti içermiyorsa "gecersiz email"
        2-@gmail.com içermiyorsa "gmail adresi giriniz"
        3-@gmail.com ile bitmiyorsa "yazım hatası" şeklinde sonuc yazdırın.
         */
     public static void main(String[] args) {
         String email = "myasirdindar@gmail.com";

         if (!(email.contains("@"))){
             System.out.println("Gecersiz email");
         } else if (!(email.contains("@gmail.com"))) {
             System.out.println("gmail adresi giriniz");
         } else if (!(email.endsWith("@gmail.com"))) {
             System.out.println("Yazim hatasi");
         }else {
             System.out.println("email basarili bir sekilde kaydedildi");
         }
     }
}
