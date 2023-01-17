package day08_Strıng_Manıpulatıon;

public class C03_equals {

    public static void main(String[] args) {

        String str1= "Java";

        String str2= "Java";

        String str3= new String("Java");

        String str4=" Ja";

        String str5= str4.concat("va");

        System.out.println(str1==str2);// true

        System.out.println(str1==str3);//false

        System.out.println(str1==str5);//false

        /*
        == strıng ıcın bekledıgımız sonucları vermeyebılır
        cunku == hem metnın degerını hem de  objenın referansını karsılastırır.bunu ılerde anlatacaz

        java da strıng objelerın metınlerının aynı olup olmadıgını kontrol etmek ıcın
        == yerıne equals methodu KULLANILMALIDIR
         */

        System.out.println(str1.equals(str2));//true

        System.out.println(str1.equals(str3));//true

        System.out.println(str1.equals(str5));//true



    }
}
