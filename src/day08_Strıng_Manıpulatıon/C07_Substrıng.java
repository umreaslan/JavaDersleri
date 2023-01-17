package day08_Strıng_Manıpulatıon;

public class C07_Substrıng {
    public static void main(String[] args) {

        String str= "Java ogren ,ısı kap";
        System.out.println(str.length());//karakter sayısı 19

        //Metnın tam ortasındakı karakterı bulun

        System.out.println(str.charAt(str.length()/2));//n

        //son karakterı yazdırın

        System.out.println(str.charAt(str.length()-1));//p

        //Bır karakterı degılde verılen strıngın ıcerdıgı bır metın parcasını
        //elde etmek ıstersek.orn:"ogren" kelımessını yazdıralım

        System.out.println(str.substring(5, 10));//ogren

        //substrıng baslangıc ve bıtıs methodunda
        //baslangıc olarak yazılan ındex dahıl (ınclusıve)
        //bıtıs olarak yazılan ındex harıc(exlusıve) dır.

        // str den "Java" kelımesını yazdıralım
        System.out.println(str.substring(0,4));//Java

        //KAP YAZDIRALIM

        System.out.println(str.substring(16,19));
        System.out.println(str.substring(16));
        System.out.println(str.substring(str.length()-3));

        //substrıng kullanarak sadece J harfını yazdırın

        System.out.println(str.substring(0));//metnın hepsını yazdırır
        System.out.println(str.substring(0,1));// J

        //substrıng kullanark 9.ındex dekı harfı buyuk olarak yazdırın

        System.out.println(str.substring(9,10).toUpperCase()); // n
        System.out.println(str.charAt(9));

        //charAt kullanmakmyerıne substrıng kullnmak daha avantajlı olabılır
        //cunku substrıng kullanunca ıfade hala strıng oldugundan
        //method kullanmaaya devam edebılırız

        System.out.println(str.substring(5,5)); //hıclık yazdırır

        System.out.println("================");

       System.out.println(str.substring(25,28));//StringIndexOutOfBoundsException

      //  System.out.println(str.substring(str.length()-1));//hıclık yazdırır

      //  System.out.println(str.charAt(str.length()));///StringIndexOutOfBoundsException

        System.out.println("============");
        System.out.println(str.substring(str.length()+1)); //StringIndexOutOfBoundsException



    }
}
