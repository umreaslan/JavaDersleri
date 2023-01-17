package day08_Strıng_Manıpulatıon;

public class C04_equalseıgnoreCase {
    public static void main(String[] args) {

         String str1= "Pazar";
         String str2= "PAZAR" ;
         String str3= "pazar";
         String str4="PazaR";

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        /*
        eger ıkı metnı KARSILASTIRIRKRN buyuk harf kucuk harf duyarlılıgı (fgcase sensıtıve) onemsız ıse o zaman
        equalsıgnorcase kullanılır
         */

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
    }
}
